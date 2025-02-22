package com.emerson.pokeapp.domain.usecases

import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.repositories.PokemonRepository

class GetPokemonInfoUseCase(
    private val pokemonRepository: PokemonRepository
) {

    suspend operator fun invoke(pokemonName: String): PokemonInfo {
        return pokemonRepository.getPokemonInfo(pokemonName)

    }

}