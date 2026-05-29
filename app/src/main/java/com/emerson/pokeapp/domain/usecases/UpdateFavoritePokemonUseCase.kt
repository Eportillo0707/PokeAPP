package com.emerson.pokeapp.domain.usecases

import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository

class UpdateFavoritePokemonUseCase(
    private val pokemonRepository: PokemonRepository

) {
    suspend operator fun invoke(pokemonItem: PokemonItem) {
        if (pokemonItem.isFavored) {
            pokemonRepository.insertFavorite(pokemonItem)
        } else {
            pokemonRepository.deleteFavorite(pokemonItem)

        }
    }
}