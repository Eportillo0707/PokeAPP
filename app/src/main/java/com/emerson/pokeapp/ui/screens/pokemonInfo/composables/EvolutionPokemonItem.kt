package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.BuildConfig
import com.emerson.pokeapp.domain.model.PokemonSpecies
import com.emerson.pokeapp.ui.screens.pokemonList.composables.ImageLoading
import com.emerson.pokeapp.ui.theme.montserratFamily
import com.emerson.pokeapp.ui.utils.formatPokemonName

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun EvolutionPokemonItem(
    evolution: PokemonSpecies,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    enableSharedTransition: Boolean,
    onClick: () -> Unit,
    showMethod: Boolean = true,
    imageSize: Dp = 115.dp,
    itemWidth: Dp = 155.dp
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(itemWidth)
            .padding(bottom = 20.dp)
    ) {
        EvolutionPokemonImage(
            evolution = evolution,
            sharedTransitionScope = sharedTransitionScope,
            animatedVisibilityScope = animatedVisibilityScope,
            enableSharedTransition = enableSharedTransition,
            imageSize = imageSize,
            onClick = onClick
        )

        BasicText(
            text = formatPokemonName(evolution.name),
            style = TextStyle(
                color = Color.White,
                fontFamily = montserratFamily,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
            maxLines = 1,
            softWrap = false,
            autoSize = TextAutoSize.StepBased(
                minFontSize = 10.sp,
                maxFontSize = 20.sp
            ),
            modifier = Modifier.fillMaxWidth()
        )

        if (showMethod && !evolution.evolutionMethod.isNullOrBlank()) {
            EvolutionMethodLabel(
                method = evolution.evolutionMethod,
                itemImageUrl = evolution.evolutionItemImageUrl,
                itemWidth = itemWidth
            )
        }
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun EvolutionPokemonImage(
    evolution: PokemonSpecies,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    enableSharedTransition: Boolean,
    imageSize: Dp,
    onClick: () -> Unit
) {
    with(sharedTransitionScope) {
        val imageModifier = Modifier
            .size(imageSize)
            .clickable { onClick() }

        Box(
            contentAlignment = Alignment.Center,
            modifier = if (enableSharedTransition) {
                imageModifier.sharedElement(
                    sharedContentState = rememberSharedContentState(
                        key = "pokemon-image-${evolution.name}"
                    ),
                    animatedVisibilityScope = animatedVisibilityScope
                )
            } else {
                imageModifier
            }
        ) {
            SubcomposeAsyncImage(
                model = String.format(
                    BuildConfig.POKEMON_IMAGE_URL,
                    evolution.id
                ),
                contentDescription = "Pokemon Image",
                loading = { ImageLoading() },
                error = { },
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
