package com.emerson.pokeapp.domain.usecases

import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow

class SearchPokemonUseCase(
    private val repository: PokemonRepository
) {
    suspend operator fun invoke(query: String): Flow<PagingData<PokemonItem>> {
        return repository.getPokemonList(0, query)
    }
}