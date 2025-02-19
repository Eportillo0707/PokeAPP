package com.emerson.pokeapp.data.repositories

import androidx.paging.PagingData
import com.apollographql.apollo3.ApolloClient
import com.emerson.pokeapp.data.remote.GetPokemonInfoQuery
import com.emerson.pokeapp.data.source.PokemonRemoteDataSource
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.PokemonSpecies
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow

internal class PokemonRepositoryImpl(

    private val remoteDataSource: PokemonRemoteDataSource,
    private val apolloClient: ApolloClient
) : PokemonRepository {
    override suspend fun getPokemonList(offset: Int, query: String): Flow<PagingData<PokemonItem>> {
        return remoteDataSource.getPokemonList(limit = 20, offset, query)
    }

    override suspend fun getPokemonInfo(pokemonName: String): PokemonInfo {
        return remoteDataSource.getPokemonInfo(pokemonName)
    }

    override suspend fun getPokemonEvolution(pokemonName: String): List<List<PokemonSpecies>> {
        val response = apolloClient.query(GetPokemonInfoQuery(pokemonName = pokemonName)).execute()

        val evolutionChain = response.data?.pokemon_v2_pokemon?.firstOrNull()
            ?.pokemon_v2_pokemonspecy?.pokemon_v2_evolutionchain?.pokemon_v2_pokemonspecies
            ?.map {
                PokemonSpecies(
                    id = it.id,
                    name = it.name,
                    evolvesFromSpeciesId = it.evolves_from_species_id
                )
            } ?: emptyList()
        return buildEvolutionTree(evolutionChain)
    }

    private fun buildEvolutionTree(evolutionChain: List<PokemonSpecies>): List<List<PokemonSpecies>> {
        val evolutionMap = evolutionChain.groupBy { it.evolvesFromSpeciesId }
        val sortedChains = mutableListOf<List<PokemonSpecies>>()

        val basePokemon =
            evolutionChain.find { it.evolvesFromSpeciesId == null } ?: return sortedChains

        fun traverseEvolutionChain(
            current: PokemonSpecies,
            currentChain: MutableList<PokemonSpecies>
        ) {
            val nextEvolutions = evolutionMap[current.id].orEmpty()
            if (nextEvolutions.isEmpty()) {
                sortedChains.add(currentChain.toList())
            } else {
                nextEvolutions.forEach { nextPokemon ->
                    traverseEvolutionChain(nextPokemon, currentChain.apply { add(nextPokemon) })
                }

            }

        }
        traverseEvolutionChain(basePokemon, mutableListOf(basePokemon))
        return sortedChains
    }


}






