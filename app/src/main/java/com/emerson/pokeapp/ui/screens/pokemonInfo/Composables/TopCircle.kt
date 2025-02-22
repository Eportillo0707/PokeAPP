package com.emerson.pokeapp.ui.screens.pokemonInfo.Composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun TopCircle(
    typeColors: List<Color>,
    modifier: Modifier = Modifier,
) {
    Box(

        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF121422))
            .zIndex(0f)
    ) {

        Canvas(
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.TopCenter)
        ) {
            val radius = size.width
            val gradient = Brush.linearGradient(
                colors = listOf(
                    typeColors[0],
                    typeColors[0].copy(alpha = 1f),
                    typeColors.getOrElse(1) { typeColors[0] }
                ),

                start = Offset(0f, size.height),
                end = Offset(size.width, 0f)
            )
            val path = Path().apply {
                addArc(
                    Rect(
                        left = -radius / 2,
                        top = -radius,
                        right = radius * 1.5f,
                        bottom = radius
                    ),
                    startAngleDegrees = 0f,
                    sweepAngleDegrees = 180f
                )
            }
            clipPath(path) {
                drawCircle(
                    brush = gradient,
                    radius = radius,
                    center = Offset(size.width / 2, 0f)
                )
            }
        }


    }
}