package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlin.math.cos
import kotlin.math.roundToInt
import kotlin.math.sin

@Composable
fun FavoriteButton(
    icon: ImageVector,
    isSelected: Boolean,
    onCLick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var particlesTrigger by remember { mutableIntStateOf(0) }

    val iconColor by animateColorAsState(
        targetValue = if (isSelected) Color(0xFFFFD54F) else Color.LightGray,
        label = "favoriteIconColor"
    )

    val scale by animateFloatAsState(
        targetValue = if (isSelected) 1.15f else 1f,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMediumLow
        ),
        label = "favoriteScale"
    )

    val rotation by animateFloatAsState(
        targetValue = if (isSelected) 360f else 0f,
        animationSpec = keyframes {
            durationMillis = 350
            0f at 0
            18f at 90
            -12f at 180
            0f at 350
        },
        label = "favoriteRotation"
    )

    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = modifier.fillMaxWidth()
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(top = 0.dp)
                .offset(x = 16.dp)
                .size(100.dp)
        ) {
            FavoriteParticles(
                trigger = particlesTrigger
            )

            Icon(
                imageVector = icon,
                contentDescription = "Favorite",
                tint = iconColor,
                modifier = Modifier
                    .size(45.dp)
                    .scale(scale)
                    .rotate(rotation)
                    .clickable(
                        indication = null,
                        interactionSource = remember { MutableInteractionSource() }
                    ) {
                        if (!isSelected) {
                            particlesTrigger++
                        }
                        onCLick()
                    }
            )
        }
    }
}

@Composable
private fun FavoriteParticles(
    trigger: Int
) {
    val particleCount = 10
    val progress = remember { Animatable(0f) }

    LaunchedEffect(trigger) {
        if (trigger > 0) {
            progress.snapTo(0f)
            progress.animateTo(
                targetValue = 1f,
                animationSpec = keyframes {
                    durationMillis = 650
                    0f at 0
                    1f at 650
                }
            )
        }
    }

    if (progress.value > 0f && progress.value < 1f) {
        repeat(particleCount) { index ->
            val angle = (360f / particleCount) * index
            val radians = Math.toRadians(angle.toDouble())

            val startDistance = 34f
            val endDistance = 58f
            val distance = startDistance + ((endDistance - startDistance) * progress.value)

            val x = cos(radians) * distance
            val y = sin(radians) * distance

            val particleScale = 1f - (progress.value * 0.35f)
            val particleAlpha = 1f - progress.value

            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = null,
                tint = Color(0xFFFFD54F),
                modifier = Modifier
                    .offset {
                        IntOffset(
                            x = x.roundToInt(),
                            y = y.roundToInt()
                        )
                    }
                    .size(11.dp)
                    .scale(particleScale)
                    .alpha(particleAlpha)
            )
        }
    }
}