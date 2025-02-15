package com.emerson.pokeapp.ui.screens.searchPokemon

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.components.PokemonListItem
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun SearchPokemonScreen(
    viewModel: SearchPokemonViewModel,
    navController: NavController
) {
    ScreenContent(
        onQueryChanged = { },
        searchResultState = viewModel.searchResultState,
        onRetryClick = { }
    )

}

@Composable
private fun ScreenContent(
    onQueryChanged: (String) -> Unit,
    searchResultState: StateFlow<UiState<List<PokemonItem>>>,
    onRetryClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()

    ) {
        var text by remember { mutableStateOf("") }

        TextField(
            value = text,
            onValueChange = {
                text = it
                onQueryChanged(it)
            },
            modifier = Modifier.fillMaxWidth()
        )


    }
}

@Composable
private fun ColumnScope.PokemonList(
    searchResultState: StateFlow<UiState<List<PokemonItem>>>,

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
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 20.dp)

            ) {
                Spacer(modifier = Modifier.height(20.dp))
                result.data.forEach { pokemonItem ->
                    PokemonListItem(
                        pokemonItem = pokemonItem,

                    )
                }

            }
        }

    }

}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ScreenPreview() {
    ScreenContent(
        onQueryChanged = { },
        searchResultState = MutableStateFlow(
            UiState.Result(
                listOf(
                    PokemonItem(
                        name = "Pikachu",
                        id = 1,
                        pokemonTypes = listOf("Grass", "Poison")

                    )
                )
            )
        ),
    ) { }
}