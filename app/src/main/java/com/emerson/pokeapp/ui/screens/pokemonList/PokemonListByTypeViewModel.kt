package com.emerson.pokeapp.ui.screens.pokemonList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.usecases.GetPokemonByTypeUseCase
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PokemonListByTypeViewModel(
    private val getPokemonByTypeUseCase: GetPokemonByTypeUseCase,
    private val type: String

): ViewModel() {
    private val _pokemonList = MutableStateFlow<UiState<List<PokemonItem>>>(UiState.Loading)
    val pokemonList: StateFlow<UiState<List<PokemonItem>>> get() = _pokemonList

    init {
        getPokemonByType(type)
    }

     private fun getPokemonByType(type: String) {
       viewModelScope.launch {
           _pokemonList.value = UiState.Loading
           try {
               val result = getPokemonByTypeUseCase(type)
               _pokemonList.value = UiState.Result(result)
           } catch (e: Exception) {
               _pokemonList.value = UiState.Error
           }
       }
    }

}