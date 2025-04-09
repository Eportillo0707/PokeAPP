package com.emerson.pokeapp.ui.screens.pokemonList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.screens.pokemonList.composables.PokemonListItem
import com.emerson.pokeapp.ui.utils.UiState

@Composable
fun PokemonListByTypeScreen(
    viewModel: PokemonListByTypeViewModel,
    navController: NavController
) {
    val pokemonList = viewModel.pokemonList.collectAsState()
    when (val state = pokemonList.value) {
        is UiState.Loading -> {
            AppLoading()
        }

        is UiState.Error -> {
            AppError()

        }

        is UiState.Result -> {
            ScreenContent(
                onPokemonClick = { pokemonName ->
                    navController.navigate("pokemonInfo/$pokemonName")
                },
                pokemonList = state.data
            )

        }
    }

}

@Composable
fun ScreenContent(
    onPokemonClick: (String) -> Unit,
    pokemonList: List<PokemonItem>
) {

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF121422)),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(pokemonList.size) { index ->
            val pokemon = pokemonList[index]

            PokemonListItem(
                pokemonItem = pokemon,
                onCLick = { onPokemonClick(pokemon.name) }
            )
        }
    }

}