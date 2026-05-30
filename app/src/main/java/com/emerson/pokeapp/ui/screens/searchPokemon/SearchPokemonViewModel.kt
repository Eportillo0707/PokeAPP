package com.emerson.pokeapp.ui.screens.searchPokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.usecases.SearchPokemonUseCase
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.mapLatest
import kotlinx.coroutines.flow.stateIn

class SearchPokemonViewModel(
    private val searchPokemonUseCase: SearchPokemonUseCase
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    @OptIn(FlowPreview::class)
    val searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>> =
        _searchQuery
            .debounce(300)
            .mapLatest { it.trim() }
            .distinctUntilChanged()
            .filter { it.isNotBlank() }
            .mapLatest { query ->
                try {
                    val resultFlow = searchPokemonUseCase(query)
                        .cachedIn(viewModelScope)

                    UiState.Result(resultFlow)
                } catch (ex: Exception) {
                    UiState.Error
                }
            }
            .catch {
                emit(UiState.Error)
            }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5000),
                initialValue = UiState.Loading
            )

    fun onSearchQueryChanged(query: CharSequence) {
        _searchQuery.value = query.toString()
    }
}