package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.slideInVertically
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import kotlinx.coroutines.delay

@Composable
fun PokemonInfoEnterAnimation(
    animationKey: Any?,
    delayMillis: Long = 0,
    content: @Composable AnimatedVisibilityScope.() -> Unit
) {
    val visibleState = remember(animationKey) {
        mutableStateOf(false)
    }

    LaunchedEffect(animationKey) {
        visibleState.value = false
        delay(delayMillis)
        visibleState.value = true
    }

    AnimatedVisibility(
        visible = visibleState.value,
        enter = fadeIn(
            animationSpec = tween(durationMillis = 280)
        ) + slideInVertically(
            animationSpec = tween(durationMillis = 280),
            initialOffsetY = { it / 5 }
        ) + scaleIn(
            animationSpec = tween(durationMillis = 280),
            initialScale = 0.96f
        ),
        exit = fadeOut(
            animationSpec = tween(durationMillis = 120)
        ),
        content = content
    )
}