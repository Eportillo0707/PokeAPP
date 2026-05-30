package com.emerson.pokeapp.ui.screens.pokemonInfo

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.TypeEffectiveness
import com.emerson.pokeapp.domain.model.getPokemonTypeColor
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.HorizontalAnimation
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.PokemonImage
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.PokemonInfoHeader
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.PokemonInfoTopBar
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.PokemonTypeBadgesRow
import com.emerson.pokeapp.ui.utils.UiState

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun PokemonInfoScreen(
    viewModel: PokemonInfoViewModel,
    navController: NavController,
    initialPokemonName: String,
    initialPokemonId: Int?,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    val pokemonState = viewModel.pokemonInfo.collectAsState()
    val resistances = viewModel.resistances.collectAsState()

    when (val state = pokemonState.value) {
        UiState.Loading -> {
            PokemonInfoLoadingContent(
                navController = navController,
                initialPokemonName = initialPokemonName,
                initialPokemonId = initialPokemonId,
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = animatedVisibilityScope
            )
        }

        UiState.Error -> {
            AppError()
        }

        is UiState.Result -> {
            PokemonInfoContent(
                pokemon = state.data,
                resistances = resistances.value,
                navController = navController,
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = animatedVisibilityScope,
                onFavoriteClick = viewModel::onFavoriteButtonClicked
            )
        }
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun PokemonInfoLoadingContent(
    navController: NavController,
    initialPokemonName: String,
    initialPokemonId: Int?,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121422))
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            PokemonInfoTopBar(
                onBackClick = { navController.popBackStack() }
            )

            if (initialPokemonId != null) {
                PokemonImage(
                    pokemonItem = PokemonItem(
                        name = initialPokemonName,
                        id = initialPokemonId,
                        pokemonTypes = emptyList()
                    ),
                    sharedTransitionScope = sharedTransitionScope,
                    animatedVisibilityScope = animatedVisibilityScope
                )
            } else {
                AppLoading()
            }
        }
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun PokemonInfoContent(
    pokemon: PokemonInfo,
    resistances: TypeEffectiveness,
    navController: NavController,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    modifier: Modifier = Modifier,
    onFavoriteClick: () -> Unit = {}
) {
    val pokemonItem = remember(pokemon) {
        PokemonItem(
            name = pokemon.name,
            id = pokemon.id,
            pokemonTypes = pokemon.types,
            isFavored = pokemon.isFavored
        )
    }

    val typeColors = remember(pokemon.types) {
        pokemon.types.map { getPokemonTypeColor(it) }
    }

    val lazyListState = rememberLazyListState()

    LaunchedEffect(pokemon.id) {
        lazyListState.animateScrollToItem(0)
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF121422))
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            PokemonInfoTopBar(
                onBackClick = { navController.popBackStack() }
            )

            LazyColumn(
                state = lazyListState,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF121422))
            ) {
                item {
                    PokemonInfoHeader(
                        pokemonItem = pokemonItem,
                        typeColors = typeColors,
                        isFavorite = pokemon.isFavored,
                        sharedTransitionScope = sharedTransitionScope,
                        animatedVisibilityScope = animatedVisibilityScope,
                        onFavoriteClick = onFavoriteClick
                    )

                    PokemonTypeBadgesRow(
                        types = pokemonItem.pokemonTypes
                    )
                }

                item {
                    HorizontalAnimation(
                        resistances = resistances,
                        pokemon = pokemon,
                        navController = navController,
                        sharedTransitionScope = sharedTransitionScope,
                        animatedVisibilityScope = animatedVisibilityScope
                    )
                }
            }
        }
    }
}
