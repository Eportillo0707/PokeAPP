package com.emerson.pokeapp.ui.screens.favoritesPokemon

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.screens.pokemonList.Composables.PokemonListItem
import kotlinx.coroutines.launch

@Composable
fun FavoritesPokemonScreen(

    viewModel: FavoritesPokemonViewModel,
    navController: NavController,

) {
    var favoritesPokemon by remember { mutableStateOf<List<PokemonItem>>(emptyList()) }

    LaunchedEffect( Unit) {
        launch {
            viewModel.favoritesPokemon.collect {
                favoritesPokemon = it
            }
        }
    }
    ScreenContent(
        favoritesPokemon = favoritesPokemon,
        onPokemonClick = { pokemonName ->
            navController.navigate("pokemonInfo/$pokemonName")
        }
    )


}


@Composable
private fun ScreenContent(
    favoritesPokemon: List<PokemonItem>,
    onPokemonClick: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121422))
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
            items(favoritesPokemon.size) { index ->
                val pokemon = favoritesPokemon[index]
                PokemonListItem(
                    pokemonItem = pokemon,
                    onCLick = { onPokemonClick(pokemon.name) }
                )


            }
        }
    }
}