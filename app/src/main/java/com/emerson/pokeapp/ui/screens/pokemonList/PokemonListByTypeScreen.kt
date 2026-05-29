package com.emerson.pokeapp.ui.screens.pokemonList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.PokemonTypeMap
import com.emerson.pokeapp.domain.model.PokemonTypes
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.screens.pokemonList.composables.PokemonListItem
import com.emerson.pokeapp.ui.utils.UiState

@Composable
fun PokemonListByTypeScreen(
    viewModel: PokemonListByTypeViewModel,
    navController: NavController,

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
                navController = navController,
                pokemonList = state.data,
                type = viewModel.type

            )

        }
    }

}

@Composable
fun ScreenContent(
    onPokemonClick: (String) -> Unit,
    pokemonList: List<PokemonItem>,
    navController: NavController,
    type: String

) {
    val iconRes = PokemonTypeMap[type.lowercase()]
    Box(
        modifier = Modifier
            .fillMaxWidth()
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
                    .height(60.dp)

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
                iconRes?.let {
                    Icon(
                        painter = painterResource(id = it),
                        contentDescription = type,
                        tint = Color.Unspecified,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(55.dp)
                            .padding(5.dp)
                    )

                }
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
                items(pokemonList.size) { index ->
                    val pokemon = pokemonList[index]

                    PokemonListItem(
                        pokemonItem = pokemon,
                        onCLick = { onPokemonClick(pokemon.name) }
                    )
                }
            }
        }
    }
}


