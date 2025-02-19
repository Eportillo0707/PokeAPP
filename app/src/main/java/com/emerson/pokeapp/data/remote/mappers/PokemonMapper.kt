package com.emerson.pokeapp.data.remote.mappers

import com.emerson.pokeapp.data.remote.GetPokemonInfoQuery
import com.emerson.pokeapp.data.remote.GetPokemonListQuery
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.PokemonSpecies
import com.emerson.pokeapp.domain.model.PokemonStat

class PokemonMapper {
    fun mapToDomain(pokemon: GetPokemonListQuery.Pokemon_v2_pokemon): PokemonItem {

        val pokemonTypes = pokemon.pokemon_v2_pokemontypes.mapNotNull {
            it.pokemon_v2_type?.name ?: ""
        }

        return PokemonItem(
            id = pokemon.id,
            name = pokemon.name ?: "",
            pokemonTypes = pokemonTypes
        )
    }

    fun mapToDomain(pokemon: GetPokemonInfoQuery.Pokemon_v2_pokemon): PokemonInfo {

        val stats = pokemon.pokemon_v2_pokemonstats.mapNotNull {
            val name = it.pokemon_v2_stat?.name ?: return@mapNotNull null
            PokemonStat(name, it.base_stat)

        }
        val evolutionChain = pokemon.pokemon_v2_pokemonspecy
            ?.pokemon_v2_evolutionchain
            ?.pokemon_v2_pokemonspecies
            ?.map {
                PokemonSpecies(
                    id = it.id,
                    name = it.name,
                    evolvesFromSpeciesId = it.evolves_from_species_id
                )
            } ?.let { listOf(it) }
        return PokemonInfo(
            id = pokemon.id,
            name = pokemon.name,
            height = pokemon.height ?: 0,
            weight = pokemon.weight ?: 0,
            baseExperience = pokemon.base_experience ?: 0,
            stats = stats,
            types = pokemon.pokemon_v2_pokemontypes.mapNotNull { it.pokemon_v2_type?.name },
            evolutionChain = evolutionChain ?: emptyList()
        )
    }


}