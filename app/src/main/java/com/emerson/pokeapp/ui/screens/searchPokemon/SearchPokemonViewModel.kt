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
import kotlinx.coroutines.launch

class SearchPokemonViewModel(
    private val searchPokemonUseCase: SearchPokemonUseCase
) : ViewModel() {
    private val _searchResults: MutableStateFlow<UiState<Flow<PagingData<PokemonItem>>>> =
        MutableStateFlow(UiState.Loading)

    val searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>>
        get() = _searchResults.asStateFlow()


    init {
        viewModelScope.launch {
            searchPokemonUseCase.searchResult.collect {
                _searchResults.value = it
            }
        }
    }

    fun onSearchQueryChanged(query: CharSequence) = searchPokemonUseCase.searchQuery(query)

}