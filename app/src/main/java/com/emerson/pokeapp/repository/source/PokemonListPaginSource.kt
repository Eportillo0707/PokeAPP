package com.emerson.pokeapp.repository.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.emerson.pokeapp.data.remote.PokeApi
import com.emerson.pokeapp.data.remote.responses.PokemonDto
import com.emerson.pokeapp.domain.model.Pokemon
import com.emerson.pokeapp.domain.model.toModel
import kotlinx.coroutines.delay

class PokemonListPaginSource(
    private val service: PokeApi
) : PagingSource<Int, Pokemon>() {
    override fun getRefreshKey(state: PagingState<Int, Pokemon>): Int = 0

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Pokemon> {
        val offset = params.key ?: 0
        val limit = 20

        return try {
            val response = service.getPokemonList(limit, offset)
                val pokemonList = response.results.map{it.toPokemon()}
            delay(5000)

            LoadResult.Page(
                data = response,
                prevKey = if (offset == 0) null else offset - limit,
                nextKey = if (response.isEmpty()) null else offset + limit
            )

        } catch (ex: Exception) {
            LoadResult.Error(ex)

        }
    }
}