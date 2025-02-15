package com.emerson.pokeapp.domain.usecases

import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map

class SearchPokemonUseCase(
    private val repository: PokemonRepository
) {
    private companion object {
        const val DEBOUNCE_DURATION = 300L
    }

    private val _searchFlow: MutableSharedFlow<CharSequence> = MutableSharedFlow(
        extraBufferCapacity = 1
    )

    @OptIn(FlowPreview::class)
    val searchResult: Flow<UiState<Flow<PagingData<PokemonItem>>>> =
        _searchFlow
            .filter(CharSequence::isNotBlank)
            .debounce(DEBOUNCE_DURATION)
            .map(CharSequence::toString)
            .map(::performSearch)
            .catch { emit(UiState.Error) }

    fun searchQuery(query: CharSequence) {
        _searchFlow.tryEmit(query)
    }

    private suspend fun performSearch(query: String): UiState<Flow<PagingData<PokemonItem>>> {
        return try {
            val resultFlow = repository.getPokemonList(0, query)
            UiState.Result(resultFlow)
        } catch (ex: Exception) {
            UiState.Error
        }
    }

}