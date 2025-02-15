package com.emerson.pokeapp.ui.screens.pokemonList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.room.util.query
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.usecases.GetPokemonListUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class PokemonListViewModel(
    getPokemonListUseCase: GetPokemonListUseCase
) : ViewModel() {
    private val _pokemonList = MutableStateFlow<PagingData<PokemonItem>>(PagingData.empty())
    val pokemonItem: StateFlow<PagingData<PokemonItem>> get() = _pokemonList.asStateFlow()


    init {
        viewModelScope.launch {
            getPokemonListUseCase(offset = 0, query = "%")
                .cachedIn(viewModelScope)
                .collectLatest(_pokemonList::emit)
        }
    }
}