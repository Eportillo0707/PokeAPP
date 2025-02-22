package com.emerson.pokeapp.ui.screens.pokemonInfo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.usecases.GetPokemonInfoUseCase
import com.emerson.pokeapp.domain.usecases.UpdateFavoritePokemonUseCase
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PokemonInfoViewModel(
    private val getPokemonInfoUseCase: GetPokemonInfoUseCase,
    private val updateFavoritePokemonUseCase: UpdateFavoritePokemonUseCase,
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

    fun onFavoriteButtonClicked() {
        val currentState = _pokemonInfo.value
        if (currentState is UiState.Result) {
            val currentPokemon = currentState.data

            val updatedPokemon = currentPokemon.copy(isFavored = !currentPokemon.isFavored)

            val pokemonItem = PokemonItem(
                id = updatedPokemon.id,
                name = updatedPokemon.name,
                pokemonTypes = updatedPokemon.types,
                isFavored = updatedPokemon.isFavored
            )

            viewModelScope.launch {
                updateFavoritePokemonUseCase(pokemonItem)

                _pokemonInfo.value = UiState.Result(updatedPokemon)
            }
        }
    }

}




