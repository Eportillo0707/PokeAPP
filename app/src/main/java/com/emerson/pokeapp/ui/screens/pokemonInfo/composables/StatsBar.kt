package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.ui.theme.montserratFamily

@Composable
fun StatsBar(
    statName: String,
    statValue: Int,
    animateStats: Boolean,
    statMaxValue: Int = 255,
    modifier: Modifier = Modifier
) {
    val targetProgress = if (animateStats) {
        statValue / statMaxValue.toFloat()
    } else {
        0f
    }

    val progress by animateFloatAsState(
        targetValue = targetProgress,
        animationSpec = tween(
            durationMillis = 1000,
            easing = LinearEasing
        ),
        label = "statBarAnimation"
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = statName.uppercase(),
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = montserratFamily,
                fontSize = 14.sp,
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 15.dp)
            )

            Text(
                text = "$statValue",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontFamily = montserratFamily,
                fontSize = 15.sp,
                modifier = Modifier.padding(end = 20.dp)
            )
        }

        Spacer(modifier = modifier.height(4.dp))

        Box(
            modifier = modifier
                .height(10.dp)
                .fillMaxWidth(0.98f)
                .background(
                    color = Color.Gray.copy(alpha = 0.3f),
                    shape = RoundedCornerShape(10.dp)
                )
        ) {
            Box(
                modifier = modifier
                    .fillMaxHeight()
                    .fillMaxWidth(progress)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
            )
        }

        Spacer(modifier = modifier.height(4.dp))
    }
}

@Composable
fun Stats(
    pokemon: PokemonInfo,
    animateStats: Boolean
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 15.dp,
                end = 15.dp,
                top = 20.dp,
                bottom = 20.dp
            )
    ) {
        pokemon.stats.forEach { stat ->
            StatsBar(
                statName = stat.name ?: "Unknown",
                statValue = stat.baseStat,
                animateStats = animateStats
            )
        }
    }
}