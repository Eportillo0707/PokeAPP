package com.emerson.pokeapp.ui.screens.pokemonList

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
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
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.PokemonTypeMap
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.navigation.AppRoutes
import com.emerson.pokeapp.ui.screens.pokemonList.composables.PokemonListItem
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun PokemonListByTypeScreen(
    viewModel: PokemonListByTypeViewModel,
    navController: NavController,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    val pokemonList = viewModel.pokemonList.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    var selectedPokemonNameForTransition by rememberSaveable {
        mutableStateOf<String?>(null)
    }

    fun navigateWithSharedTransition(pokemon: PokemonItem) {
        selectedPokemonNameForTransition = pokemon.name

        coroutineScope.launch {
            delay(40)
            navController.navigate(AppRoutes.pokemonInfo(pokemon.name, pokemon.id))
        }
    }

    when (val state = pokemonList.value) {
        is UiState.Loading -> {
            AppLoading()
        }

        is UiState.Error -> {
            AppError()
        }

        is UiState.Result -> {
            ScreenContent(
                onPokemonClick = { pokemon ->
                    navigateWithSharedTransition(pokemon)
                },
                navController = navController,
                pokemonList = state.data,
                type = viewModel.type,
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = animatedVisibilityScope,
                selectedPokemonNameForTransition = selectedPokemonNameForTransition
            )
        }
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun ScreenContent(
    onPokemonClick: (PokemonItem) -> Unit,
    pokemonList: List<PokemonItem>,
    navController: NavController,
    type: String,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    selectedPokemonNameForTransition: String?
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
                .background(Color(0xFF121422))
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
                items(
                    items = pokemonList,
                    key = { pokemon ->
                        pokemon.name
                    }
                ) { pokemon ->
                    PokemonListItem(
                        pokemonItem = pokemon,
                        sharedTransitionScope = sharedTransitionScope,
                        animatedVisibilityScope = animatedVisibilityScope,
                        enableSharedTransition = selectedPokemonNameForTransition == pokemon.name,
                        onCLick = {
                            onPokemonClick(pokemon)
                        }
                    )
                }
            }
        }
    }
}