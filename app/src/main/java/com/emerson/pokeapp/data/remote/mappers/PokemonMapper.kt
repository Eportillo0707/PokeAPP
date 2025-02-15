package com.emerson.pokeapp.data.remote.mappers

import com.emerson.pokeapp.data.remote.GetPokemonListQuery
import com.emerson.pokeapp.domain.model.PokemonItem

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
}