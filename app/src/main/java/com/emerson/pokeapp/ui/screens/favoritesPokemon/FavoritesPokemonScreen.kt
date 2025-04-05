package com.emerson.pokeapp.ui.screens.favoritesPokemon

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.screens.pokemonList.composables.PokemonListItem
import com.emerson.pokeapp.ui.theme.montserratFamily
import kotlinx.coroutines.launch

@Composable
fun FavoritesPokemonScreen(

    viewModel: FavoritesPokemonViewModel,
    navController: NavController,

    ) {
    var favoritesPokemon by remember { mutableStateOf<List<PokemonItem>>(emptyList()) }

    LaunchedEffect(Unit) {
        launch {
            viewModel.favoritesPokemon.collect {
                favoritesPokemon = it
            }
        }
    }
    ScreenContent(
        favoritesPokemon = favoritesPokemon,
        navController = navController,
        onPokemonClick = { pokemonName ->
            navController.navigate("pokemonInfo/$pokemonName")
        }
    )


}


@Composable
private fun ScreenContent(
    favoritesPokemon: List<PokemonItem>,
    navController: NavController,
    onPokemonClick: (String) -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121422))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF121422)),

            ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF121422))

            ) {
                IconButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }
                Text(
                    text = "Favorites",
                    color = Color.LightGray,
                    fontFamily = montserratFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }
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
}