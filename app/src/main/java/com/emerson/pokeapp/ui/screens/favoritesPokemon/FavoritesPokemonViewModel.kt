package com.emerson.pokeapp.ui.screens.favoritesPokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.usecases.GetFavoritePokemonUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class FavoritesPokemonViewModel(
    private val getFavoritePokemonUseCase: GetFavoritePokemonUseCase

) : ViewModel() {
    private val _favoritesPokemon = MutableStateFlow<List<PokemonItem>>(emptyList())
    val favoritesPokemon: MutableStateFlow<List<PokemonItem>> = _favoritesPokemon

    init {
        getFavorites()
    }


    private fun getFavorites() {
        viewModelScope.launch {
            getFavoritePokemonUseCase().collect { favorites ->
                _favoritesPokemon.value = favorites
            }
        }
    }


}


