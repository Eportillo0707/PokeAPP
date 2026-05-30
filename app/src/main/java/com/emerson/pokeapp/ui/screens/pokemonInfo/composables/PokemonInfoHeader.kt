package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.emerson.pokeapp.domain.model.PokemonItem

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun PokemonInfoHeader(
    pokemonItem: PokemonItem,
    typeColors: List<Color>,
    isFavorite: Boolean,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    modifier: Modifier = Modifier,
    onFavoriteClick: () -> Unit = {}
) {
    Box(modifier = modifier) {
        TopCircle(typeColors = typeColors)

        FavoriteButton(
            icon = if (isFavorite) Icons.Filled.Star else Icons.Outlined.StarBorder,
            isSelected = isFavorite,
            onCLick = onFavoriteClick
        )

        PokemonImage(
            pokemonItem = pokemonItem,
            sharedTransitionScope = sharedTransitionScope,
            animatedVisibilityScope = animatedVisibilityScope
        )
    }
}
