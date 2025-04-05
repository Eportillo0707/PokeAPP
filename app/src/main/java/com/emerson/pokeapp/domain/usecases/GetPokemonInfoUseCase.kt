package com.emerson.pokeapp.domain.usecases

import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.first

class GetPokemonInfoUseCase(
    private val pokemonRepository: PokemonRepository
) {

    suspend operator fun invoke(pokemonName: String): PokemonInfo {
        val pokemonInfo = pokemonRepository.getPokemonInfo(pokemonName)

        val favoritePokemonList = pokemonRepository.getFavoritePokemon().first()
        val isFavored = favoritePokemonList.any { it.name == pokemonName }

        return pokemonInfo.copy(isFavored = isFavored)

    }


}