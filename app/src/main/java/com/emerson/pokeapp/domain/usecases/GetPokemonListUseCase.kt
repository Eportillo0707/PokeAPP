package com.emerson.pokeapp.domain.usecases

import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow

class GetPokemonListUseCase(private val repository: PokemonRepository)  {
    suspend operator fun invoke(offset: Int, query: String? = null ): Flow<PagingData<PokemonItem>> = repository.getPokemonList(offset, query)
}