package com.emerson.pokeapp.ui.screens.searchPokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.usecases.SearchPokemonUseCase
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.launch

class SearchPokemonViewModel(
    private val searchPokemonUseCase: SearchPokemonUseCase
) : ViewModel() {
    private val _searchResults: MutableStateFlow<UiState<Flow<PagingData<PokemonItem>>>> =
        MutableStateFlow(UiState.Loading)

    val searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>> get() = _searchResults.asStateFlow()

    private val searchQueryFlow = MutableStateFlow("")

    init {
        observeSearchQuery()
    }

    private fun observeSearchQuery() {
        viewModelScope.launch {
            searchPokemonUseCase.searchFlow
                .debounce(500)
                .distinctUntilChanged()
                .collectLatest { query ->
                    fetchPokemonList(query)

                }
        }
    }

    fun onSearchQueryChanged(query: String) {
        searchPokemonUseCase.searchQuery(query)
    }

    private fun fetchPokemonList(query: String) {
        _searchResults.value = UiState.Loading
        viewModelScope.launch {
            try {

                val pokemonFlow: Flow<PagingData<PokemonItem>> =
                    searchPokemonUseCase.invoke(0, query)
                _searchResults.value = UiState.Result(pokemonFlow)
            } catch (e: Exception) {
                _searchResults.value = UiState.Error
            }
        }
    }

}