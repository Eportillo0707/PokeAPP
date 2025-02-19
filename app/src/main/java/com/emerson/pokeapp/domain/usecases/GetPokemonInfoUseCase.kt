package com.emerson.pokeapp.domain.usecases

import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetPokemonInfoUseCase(
    private val pokemonRepository: PokemonRepository
) {

    suspend operator fun invoke(pokemonName: String): PokemonInfo {
        return pokemonRepository.getPokemonInfo(pokemonName)

    }

}