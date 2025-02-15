package com.emerson.pokeapp.ui.screens.searchPokemon

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.components.PokemonListItem
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun SearchPokemonScreen(
    viewModel: SearchPokemonViewModel,
    navController: NavController
) {
    ScreenContent(
        onQueryChanged = { query ->
            viewModel.onSearchQueryChanged(query)

        },
        searchResultState = viewModel.searchResultState,
        onRetryClick = { }
    )

}

@Composable
private fun ScreenContent(
    onQueryChanged: (String) -> Unit,
    searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>>,
    onRetryClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()

    ) {
        var text by remember { mutableStateOf("") }

        TextField(
            value = text,
            onValueChange = { newText ->
                text = newText
                onQueryChanged(newText)
            },
            modifier = Modifier.fillMaxWidth()
        )
        PokemonList(
            searchResultState = searchResultState
        )


    }
}

@Composable
private fun ColumnScope.PokemonList(
    searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>>,

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

            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 20.dp)
            ) {
                items(paginItems.itemCount) { index ->
                    val pokemon = paginItems[index]
                    if (pokemon != null) {
                        PokemonListItem(pokemonItem = pokemon)
                    }

                }
            }
        }

    }

}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ScreenPreview() {

}