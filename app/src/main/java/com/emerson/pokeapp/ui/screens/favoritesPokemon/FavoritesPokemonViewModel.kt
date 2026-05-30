package com.emerson.pokeapp.ui.screens.favoritesPokemon

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.usecases.GetFavoritePokemonUseCase
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class FavoritesPokemonViewModel(
    getFavoritePokemonUseCase: GetFavoritePokemonUseCase
) : ViewModel() {

    val favoritesPokemon: StateFlow<List<PokemonItem>> =
        getFavoritePokemonUseCase()
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5000),
                initialValue = emptyList()
            )
}
