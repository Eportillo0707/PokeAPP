package com.emerson.pokeapp.ui.screens.pokemonInfo

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emerson.pokeapp.data.repositories.PokemonRepositoryImpl
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonSpecies
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import com.emerson.pokeapp.domain.usecases.GetPokemonInfoUseCase
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PokemonInfoViewModel(
    private val getPokemonInfoUseCase: GetPokemonInfoUseCase,
    private val pokemonName: String,

) : ViewModel() {
    private val _pokemonInfo: MutableStateFlow<UiState<PokemonInfo>> =
        MutableStateFlow(UiState.Loading)
    val pokemonInfo: StateFlow<UiState<PokemonInfo>> get() = _pokemonInfo.asStateFlow()

    init {
        loadPokemonInfo(pokemonName)
    }

    private fun loadPokemonInfo(pokemonName: String) {
        viewModelScope.launch {
            try {
                val result = getPokemonInfoUseCase(pokemonName)
                _pokemonInfo.value = UiState.Result(result)
            } catch (e: Exception) {
                _pokemonInfo.value = UiState.Error
            }
        }
    }

}

