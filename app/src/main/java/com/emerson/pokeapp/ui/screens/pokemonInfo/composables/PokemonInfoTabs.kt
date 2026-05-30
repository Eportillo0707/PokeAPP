package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

private const val INFO_PAGE = 0
private const val STATS_PAGE = 1
private const val INDICATOR_INFO_OFFSET = 0f
private const val INDICATOR_STATS_OFFSET = 450f

@Composable
fun PokemonInfoTabs(
    selectedPage: Int,
    onInfoClick: () -> Unit,
    onStatsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val indicatorWidth = 50.dp
    val indicatorOffset = remember { Animatable(0f) }

    LaunchedEffect(selectedPage) {
        val targetOffset = when (selectedPage) {
            INFO_PAGE -> INDICATOR_INFO_OFFSET
            STATS_PAGE -> INDICATOR_STATS_OFFSET
            else -> INDICATOR_INFO_OFFSET
        }

        indicatorOffset.animateTo(
            targetValue = targetOffset,
            animationSpec = tween(durationMillis = 150)
        )
    }

    androidx.compose.foundation.layout.Column(modifier = modifier.fillMaxWidth()) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 90.dp)
        ) {
            IconButton(onClick = onInfoClick) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Info",
                    tint = if (selectedPage == INFO_PAGE) Color.White else Color.LightGray,
                    modifier = Modifier.size(40.dp)
                )
            }

            IconButton(onClick = onStatsClick) {
                Icon(
                    imageVector = Icons.Default.BarChart,
                    contentDescription = "Stats",
                    tint = if (selectedPage == STATS_PAGE) Color.White else Color.Gray,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .padding(horizontal = 85.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(width = indicatorWidth, height = 3.dp)
                    .graphicsLayer { translationX = indicatorOffset.value }
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(50)
                    )
            )
        }
    }
}
