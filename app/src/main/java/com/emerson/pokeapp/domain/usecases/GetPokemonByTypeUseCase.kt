package com.emerson.pokeapp.domain.usecases

import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository

class GetPokemonByTypeUseCase(
    private val pokemonRepository: PokemonRepository

) {
    suspend operator fun invoke(type: String) : List<PokemonItem> {
        return pokemonRepository.getPokemonByType(type)

    }

}