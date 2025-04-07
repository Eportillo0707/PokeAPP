package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.TypeEffectiveness
import kotlinx.coroutines.launch

@Composable
fun HorizontalAnimation(
    resistances: TypeEffectiveness,
    pokemon: PokemonInfo,
    navController: NavController

) {
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { 2 })
    val coroutineScope = rememberCoroutineScope()

    val indicatorWidth = 50.dp

    val indicatorOffset = remember { Animatable(0f) }
    LaunchedEffect(pagerState.currentPage) {
        val targetOffset = when (pagerState.currentPage) {
            0 -> 0f
            1 -> 450f
            else -> 0f
        }
        indicatorOffset.animateTo(
            targetValue = targetOffset,
            animationSpec = tween(durationMillis = 150)
        )
    }


    Spacer(modifier = Modifier.height(15.dp))
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 90.dp)

        ) {
            IconButton(
                onClick = { coroutineScope.launch { pagerState.scrollToPage(0) } }
            ) {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "Info",
                    tint = if (pagerState.currentPage == 0) Color.White else Color.LightGray,
                    modifier = Modifier.size(40.dp)
                )
            }
            IconButton(
                onClick = { coroutineScope.launch { pagerState.scrollToPage(1) } }
            ) {
                Icon(
                    imageVector = Icons.Default.BarChart,
                    contentDescription = "Stats",
                    tint = if (pagerState.currentPage == 1) Color.White else Color.Gray,
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
                    .background(Color.White, shape = RoundedCornerShape(50))
            )
        }
    }

    HorizontalPager(
        state = pagerState,
        beyondViewportPageCount = 1,
        modifier = Modifier
            .padding(top = 10.dp)
            .height(720.dp)
    ) { page ->
        Card(
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF202339)),
            elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
            border = CardDefaults.outlinedCardBorder(),
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 10.dp, vertical = 10.dp)
        ) {
            when (page) {
                0 -> Column(

                ) {
                    PokemonSpecs(pokemon = pokemon)
                    Spacer(modifier = Modifier.height(30.dp))
                    EvolutionChain(pokemon = pokemon, navController = navController)
                }

                1 -> Column(

                ) {
                    Stats(pokemon = pokemon)
                    TypesDetails(resistances = resistances)
                }
            }
        }


    }
}