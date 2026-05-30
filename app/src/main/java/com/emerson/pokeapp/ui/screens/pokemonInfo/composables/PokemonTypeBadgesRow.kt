package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.emerson.pokeapp.domain.model.TypeIcons
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun PokemonTypeBadgesRow(
    types: List<String>,
    modifier: Modifier = Modifier,
    animationKey: Any? = types.joinToString()
) {
    val alpha = remember(animationKey) { Animatable(0f) }
    val offsetY = remember(animationKey) { Animatable(18f) }

    LaunchedEffect(animationKey) {
        alpha.snapTo(0f)
        offsetY.snapTo(18f)

        delay(100)

        launch {
            alpha.animateTo(
                targetValue = 1f,
                animationSpec = tween(
                    durationMillis = 220,
                    easing = FastOutSlowInEasing
                )
            )
        }

        launch {
            offsetY.animateTo(
                targetValue = 0f,
                animationSpec = tween(
                    durationMillis = 220,
                    easing = FastOutSlowInEasing
                )
            )
        }
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .graphicsLayer {
                this.alpha = alpha.value
                translationY = offsetY.value
            },
        horizontalArrangement = Arrangement.Center
    ) {
        types.forEach { type ->
            val iconId = TypeIcons[type.lowercase()]

            if (iconId != null) {
                Box(contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = iconId),
                        contentDescription = type,
                        modifier = Modifier
                            .width(150.dp)
                            .height(60.dp)
                            .padding(horizontal = 10.dp)
                    )
                }
            }
        }
    }
}