package com.emerson.pokeapp.ui.screens.searchPokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.usecases.SearchPokemonUseCase
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class SearchPokemonViewModel(
    private val searchPokemonUseCase: SearchPokemonUseCase
) : ViewModel() {
    private val _searchResults: MutableStateFlow<UiState<Flow<PagingData<PokemonItem>>>> =
        MutableStateFlow(UiState.Loading)

    val searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>> get() = _searchResults.asStateFlow()

    // Método para manejar el cambio de búsqueda
    fun onSearchQueryChanged(query: CharSequence) {
        _searchResults.value = UiState.Loading // Estado de carga

        viewModelScope.launch {
            try {
                // Llamamos al UseCase, pasamos el query y obtenemos el flujo de resultados
                val pokemonFlow = searchPokemonUseCase.invoke(0, query.toString())

                // Actualizamos el estado a los resultados sin recolectarlos aquí
                _searchResults.value = UiState.Result(pokemonFlow)
            } catch (e: Exception) {
                _searchResults.value = UiState.Error
            }
        }
    }
}