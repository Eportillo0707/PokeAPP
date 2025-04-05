package com.emerson.pokeapp.ui.screens.pokemonList.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import kotlinx.coroutines.flow.StateFlow

@Composable
fun ColumnScope.ListItem(
    pokemonList: StateFlow<PagingData<PokemonItem>>,
    onClick: (String) -> Unit,
    listState: LazyGridState
) {
    val pokemonState = pokemonList.collectAsLazyPagingItems()

    when (pokemonState.loadState.refresh) {
        is LoadState.Loading -> {
            AppLoading(modifier = Modifier.align(Alignment.CenterHorizontally))
        }

        is LoadState.Error -> {
            AppError(
                onRetryClick = { pokemonState.retry() }
            )
        }

        is LoadState.NotLoading -> {
            LazyVerticalGrid(
                state = listState,
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF121422)),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                items(pokemonState.itemCount) { index ->
                    val pokemon = pokemonState[index]
                    if (pokemon != null) {
                        PokemonListItem(
                            pokemonItem = pokemon,
                            onCLick = { onClick(pokemon.name) }

                        )
                    }


                }
            }
        }
    }

}