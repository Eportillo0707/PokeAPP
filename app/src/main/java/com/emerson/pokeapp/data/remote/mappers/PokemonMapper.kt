package com.emerson.pokeapp.data.remote.mappers

import com.emerson.pokeapp.data.remote.GetPokemonInfoQuery
import com.emerson.pokeapp.data.remote.GetPokemonListQuery
import com.emerson.pokeapp.domain.model.PokemonAbility
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

        val types = pokemon.pokemon_v2_pokemontypes.mapNotNull {
            it.pokemon_v2_type?.name
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
            }?.let { listOf(it) }

        val abilities = pokemon.pokemon_v2_pokemonabilities.mapNotNull {
            val name = it.pokemon_v2_ability?.name ?: return@mapNotNull null
            val flavorText = it.pokemon_v2_ability.pokemon_v2_abilityflavortexts.firstOrNull()?.flavor_text ?: return@mapNotNull null
            val cleanedFlavorText = flavorText
                .replace("\n", " ")
                .replace("\u000C", " ")
                .replace(Regex("\\s+"), " ")
                .trim()
            PokemonAbility(name, cleanedFlavorText)
        }

        val description = pokemon.pokemon_v2_pokemonspecy
            ?.pokemon_v2_pokemonspeciesflavortexts
            ?.firstOrNull()
            ?.flavor_text
            ?.replace("\n"," ")
            ?.replace("\u000c", " ")
            ?.replace(Regex("\\s+"), " ")
            ?.trim()



        return PokemonInfo(
            id = pokemon.id,
            name = pokemon.name,
            height = pokemon.height ?: 0,
            weight = pokemon.weight ?: 0,
            baseExperience = pokemon.base_experience ?: 0,
            stats = stats,
            types = types,
            evolutionChain = evolutionChain ?: emptyList(),
            abilities = abilities,
            description = description ?: ""
        )
    }


}