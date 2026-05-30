package com.emerson.pokeapp.ui.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun AppLoading(
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize()
    ) {
        PokeballLoading()
    }
}

@Composable
private fun PokeballLoading(
    modifier: Modifier = Modifier
) {
    val infiniteTransition = rememberInfiniteTransition(
        label = "pokeballLoadingTransition"
    )

    val rotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 900,
                easing = LinearEasing
            ),
            repeatMode = RepeatMode.Restart
        ),
        label = "pokeballRotation"
    )

    Canvas(
        modifier = modifier
            .size(62.dp)
            .rotate(rotation)
    ) {
        val canvasWidth = size.width
        val canvasHeight = size.height
        val strokeWidth = canvasWidth * 0.07f
        val center = Offset(canvasWidth / 2f, canvasHeight / 2f)
        val radius = canvasWidth / 2f

        drawArc(
            color = Color(0xFFE53935),
            startAngle = 180f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset.Zero,
            size = Size(canvasWidth, canvasHeight)
        )

        drawArc(
            color = Color.White,
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = true,
            topLeft = Offset.Zero,
            size = Size(canvasWidth, canvasHeight)
        )

        drawCircle(
            color = Color(0xFF121422),
            radius = radius,
            center = center,
            style = Stroke(width = strokeWidth)
        )

        drawLine(
            color = Color(0xFF121422),
            start = Offset(0f, center.y),
            end = Offset(canvasWidth, center.y),
            strokeWidth = strokeWidth,
            cap = StrokeCap.Round
        )

        drawCircle(
            color = Color(0xFF121422),
            radius = canvasWidth * 0.18f,
            center = center
        )

        drawCircle(
            color = Color.White,
            radius = canvasWidth * 0.105f,
            center = center
        )

        drawCircle(
            color = Color(0xFF121422),
            radius = canvasWidth * 0.105f,
            center = center,
            style = Stroke(width = strokeWidth * 0.55f)
        )
    }
}