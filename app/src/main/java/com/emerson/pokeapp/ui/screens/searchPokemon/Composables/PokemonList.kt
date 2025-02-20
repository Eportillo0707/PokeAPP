package com.emerson.pokeapp.ui.screens.searchPokemon.Composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.screens.pokemonList.Composables.PokemonListItem
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun ColumnScope.PokemonList(
    searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>>,
    onClick: (String) -> Unit

) {
    val state by searchResultState.collectAsState()

    when (val result = state) {
        UiState.Loading -> {
            AppLoading(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 20.dp)
            )
        }

        is UiState.Error -> {
            Spacer(modifier = Modifier.height(20.dp))
            AppError()
        }

        is UiState.Result -> {
            val paginItems = result.data.collectAsLazyPagingItems()

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF121422)),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(paginItems.itemCount) { index ->
                    val pokemon = paginItems[index]
                    if (pokemon != null) {
                        PokemonListItem(pokemonItem = pokemon,
                            onCLick = {onClick(pokemon.name)}
                        )
                    }
                }

            }
        }

    }

}