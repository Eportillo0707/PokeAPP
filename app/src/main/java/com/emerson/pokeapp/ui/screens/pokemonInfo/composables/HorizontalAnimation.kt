package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.TypeEffectiveness
import kotlinx.coroutines.launch

private const val INFO_PAGE = 0
private const val STATS_PAGE = 1

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun HorizontalAnimation(
    resistances: TypeEffectiveness,
    pokemon: PokemonInfo,
    navController: NavController,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    val pagerState = rememberPagerState(initialPage = INFO_PAGE, pageCount = { 2 })
    val coroutineScope = rememberCoroutineScope()

    Spacer(modifier = Modifier.height(15.dp))

    PokemonInfoTabs(
        selectedPage = pagerState.currentPage,
        onInfoClick = {
            coroutineScope.launch { pagerState.scrollToPage(INFO_PAGE) }
        },
        onStatsClick = {
            coroutineScope.launch { pagerState.scrollToPage(STATS_PAGE) }
        }
    )

    HorizontalPager(
        state = pagerState,
        beyondViewportPageCount = 1,
        modifier = Modifier
            .padding(top = 10.dp)
            .height(760.dp)
    ) { page ->
        InfoPageCard {
            when (page) {
                INFO_PAGE -> {
                    PokemonDetailsPage(
                        pokemon = pokemon,
                        navController = navController,
                        sharedTransitionScope = sharedTransitionScope,
                        animatedVisibilityScope = animatedVisibilityScope
                    )
                }

                STATS_PAGE -> {
                    PokemonStatsPage(
                        pokemon = pokemon,
                        resistances = resistances,
                        animateStats = pagerState.currentPage == STATS_PAGE
                    )
                }
            }
        }
    }
}

@Composable
private fun InfoPageCard(
    content: @Composable () -> Unit
) {
    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF202339)),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        border = CardDefaults.outlinedCardBorder(),
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp, vertical = 10.dp)
    ) {
        content()
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun PokemonDetailsPage(
    pokemon: PokemonInfo,
    navController: NavController,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 16.dp)
    ) {
        PokemonSpecs(pokemon = pokemon)

        Spacer(modifier = Modifier.height(10.dp))

        EvolutionChain(
            pokemon = pokemon,
            navController = navController,
            sharedTransitionScope = sharedTransitionScope,
            animatedVisibilityScope = animatedVisibilityScope
        )
    }
}

@Composable
private fun PokemonStatsPage(
    pokemon: PokemonInfo,
    resistances: TypeEffectiveness,
    animateStats: Boolean
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(bottom = 16.dp)
    ) {
        Stats(
            pokemon = pokemon,
            animateStats = animateStats
        )

        TypesDetails(resistances = resistances)
    }
}
