package com.emerson.pokeapp.data.source

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.emerson.pokeapp.data.remote.PokeApi
import com.emerson.pokeapp.data.remote.PokeApiService
import com.emerson.pokeapp.data.remote.mappers.PokemonMapper
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.PokemonSpecies
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.Flow

class PokemonRemoteDataSource(
    private val pokeApiService: PokeApiService,
    private val pokemonMapper: PokemonMapper
) : PokeApi {

    override suspend fun getPokemonList(
        limit: Int,
        offset: Int,
        query: String?
    ): Flow<PagingData<PokemonItem>> {
        return Pager(
            config = PagingConfig(pageSize = limit, prefetchDistance = 2),
            pagingSourceFactory = {
                PokemonListPagingSource(
                    pokeApiService = pokeApiService,
                    pokemonMapper = pokemonMapper,
                    query = query
                )
            }
        ).flow
    }

    override suspend fun getPokemonInfo(pokemonName: String): PokemonInfo {
        val pokemon = pokeApiService.getPokemonDetail(pokemonName.lowercase())

        val species = runCatching {
            pokemon.species?.name?.let { pokeApiService.getPokemonSpecies(it) }
        }.getOrNull()

        val evolutionChain = runCatching {
            val evolutionChainId = pokemonMapper.extractEvolutionChainId(species?.evolutionChain?.url)
            evolutionChainId?.let { pokeApiService.getEvolutionChain(it) }
        }.getOrNull()

        val normalEvolutionSpecies = pokemonMapper.mapEvolutionSpecies(evolutionChain)

        val megaEvolutions = getMegaEvolutionsFromEvolutionSpecies(normalEvolutionSpecies)

        val abilities = coroutineScope {
            pokemon.abilities.map { abilitySlot ->
                async {
                    runCatching {
                        pokeApiService.getAbility(abilitySlot.ability.name)
                    }.getOrNull()
                }
            }.awaitAll().filterNotNull()
        }

        return pokemonMapper.mapToInfo(
            pokemon = pokemon,
            species = species,
            evolutionChain = evolutionChain,
            abilities = abilities,
            extraEvolutionForms = megaEvolutions
        )
    }

    private suspend fun getMegaEvolutionsFromEvolutionSpecies(
        evolutionSpecies: List<PokemonSpecies>
    ): List<PokemonSpecies> = coroutineScope {
        evolutionSpecies.map { baseSpecies ->
            async {
                val speciesDto = runCatching {
                    pokeApiService.getPokemonSpecies(baseSpecies.name)
                }.getOrNull() ?: return@async emptyList()

                speciesDto.varieties
                    .map { it.pokemon.name }
                    .filter { varietyName ->
                        varietyName.contains("-mega", ignoreCase = true)
                    }
                    .mapNotNull { megaName ->
                        runCatching {
                            val megaDetail = pokeApiService.getPokemonDetail(megaName)

                            PokemonSpecies(
                                id = megaDetail.id,
                                name = megaDetail.name,
                                evolvesFromSpeciesId = baseSpecies.id,
                                evolutionMethod = "Mega Evolution"
                            )
                        }.getOrNull()
                    }
            }
        }.awaitAll()
            .flatten()
            .distinctBy { it.name }
            .sortedBy { it.id }
    }

    suspend fun getPokemonByType(type: String): List<PokemonItem> {
        val typeResponse = pokeApiService.getPokemonByType(type.lowercase())

        return coroutineScope {
            typeResponse.pokemon.map { item ->
                async {
                    runCatching {
                        val detail = pokeApiService.getPokemonDetail(item.pokemon.name)
                        pokemonMapper.mapToItem(detail)
                    }.getOrNull()
                }
            }.awaitAll().filterNotNull()
        }.sortedBy { it.id }
    }
}