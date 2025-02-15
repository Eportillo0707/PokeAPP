package com.emerson.pokeapp.domain.usecases

import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

class SearchPokemonUseCase(
    private val repository: PokemonRepository
) {
    suspend operator fun invoke(offset: Int, query: String?): Flow<PagingData<PokemonItem>> {
        return repository.getPokemonList(offset, query)
    }

    private val _searchFlow: MutableSharedFlow<CharSequence> =
        MutableSharedFlow(extraBufferCapacity = 1)

    fun searchQuery(query: CharSequence) {
        _searchFlow.tryEmit(query)
    }

}