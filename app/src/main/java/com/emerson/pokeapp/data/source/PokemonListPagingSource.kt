package com.emerson.pokeapp.data.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.emerson.pokeapp.data.remote.PokeApiService
import com.emerson.pokeapp.data.remote.dto.NamedApiResourceDto
import com.emerson.pokeapp.data.remote.mappers.PokemonMapper
import com.emerson.pokeapp.domain.model.PokemonItem
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope

class PokemonListPagingSource(
    private val pokeApiService: PokeApiService,
    private val pokemonMapper: PokemonMapper,
    private val query: String? = null
) : PagingSource<Int, PokemonItem>() {

    companion object {
        private const val DEFAULT_LIMIT = 60
        private const val ALL_POKEMON_LIMIT = 20000

        private var allPokemonCache: List<NamedApiResourceDto>? = null
    }

    override fun getRefreshKey(state: PagingState<Int, PokemonItem>): Int = 0

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PokemonItem> {
        val offset = params.key ?: 0
        val limit = params.loadSize.takeIf { it > 0 } ?: DEFAULT_LIMIT
        val normalizedQuery = query?.trim()?.lowercase().orEmpty()
            .takeIf { it != "%" }
            .orEmpty()

        return try {
            val pokemonResources = if (normalizedQuery.isBlank()) {
                pokeApiService.getPokemonList(limit = limit, offset = offset).results
            } else {
                getFilteredPokemonList(normalizedQuery)
                    .drop(offset)
                    .take(limit)
            }

            val list = coroutineScope {
                pokemonResources.map { resource ->
                    async {
                        runCatching {
                            val detail = pokeApiService.getPokemonDetail(resource.name)
                            pokemonMapper.mapToItem(detail)
                        }.getOrNull()
                    }
                }.awaitAll().filterNotNull()
            }.sortedBy { it.id }

            LoadResult.Page(
                data = list,
                prevKey = if (offset == 0) null else maxOf(offset - limit, 0),
                nextKey = if (pokemonResources.isEmpty()) null else offset + limit
            )
        } catch (ex: Exception) {
            LoadResult.Error(ex)
        }
    }

    private suspend fun getFilteredPokemonList(query: String): List<NamedApiResourceDto> {
        val allPokemon = allPokemonCache ?: pokeApiService
            .getPokemonList(limit = ALL_POKEMON_LIMIT, offset = 0)
            .results
            .also { allPokemonCache = it }

        return allPokemon.filter { resource ->
            resource.name.contains(query, ignoreCase = true)
        }
    }
}
