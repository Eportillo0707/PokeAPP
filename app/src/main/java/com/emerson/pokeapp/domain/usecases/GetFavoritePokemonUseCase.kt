package com.emerson.pokeapp.domain.usecases

import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow

class GetFavoritePokemonUseCase(
    private val pokemonRepository: PokemonRepository

) {
    operator fun invoke():Flow<List<PokemonItem>>{
        return pokemonRepository.getFavoritePokemon()
    }
}