package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonSpecies
import com.emerson.pokeapp.ui.navigation.AppRoutes
import com.emerson.pokeapp.ui.theme.montserratFamily
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

private val NormalEvolutionImageSize = 115.dp
private val EvolutionItemWidth = 155.dp

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun EvolutionChain(
    pokemon: PokemonInfo,
    modifier: Modifier = Modifier,
    navController: NavController,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    val coroutineScope = rememberCoroutineScope()
    var selectedEvolutionNameForTransition by rememberSaveable {
        mutableStateOf<String?>(null)
    }

    fun navigateWithEvolutionTransition(evolution: PokemonSpecies) {
        selectedEvolutionNameForTransition = evolution.name

        coroutineScope.launch {
            delay(40)
            navController.navigate(AppRoutes.pokemonInfo(evolution.name, evolution.id))
            delay(700)
            selectedEvolutionNameForTransition = null
        }
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 12.dp)
    ) {
        pokemon.evolutionChain.forEach { evolutionLine ->
            val normalEvolutionLine = evolutionLine
                .filter { !it.name.contains("-mega", ignoreCase = true) }
                .distinctBy { it.name }

            EvolutionSection(
                title = "Evolution Chain",
                evolutions = normalEvolutionLine,
                selectedEvolutionNameForTransition = selectedEvolutionNameForTransition,
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = animatedVisibilityScope,
                onEvolutionClick = ::navigateWithEvolutionTransition,
                showArrows = true
            )
        }

        val megaEvolutions = pokemon.megaEvolutions
            .ifEmpty {
                pokemon.evolutionChain
                    .flatten()
                    .filter { it.name.contains("-mega", ignoreCase = true) }
            }
            .distinctBy { it.name }
            .sortedBy { it.id }

        EvolutionSection(
            title = "Mega Evolutions",
            evolutions = megaEvolutions,
            selectedEvolutionNameForTransition = selectedEvolutionNameForTransition,
            sharedTransitionScope = sharedTransitionScope,
            animatedVisibilityScope = animatedVisibilityScope,
            onEvolutionClick = ::navigateWithEvolutionTransition,
            showArrows = false,
            titleTopPadding = 8.dp
        )
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun EvolutionSection(
    title: String,
    evolutions: List<PokemonSpecies>,
    selectedEvolutionNameForTransition: String?,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    onEvolutionClick: (PokemonSpecies) -> Unit,
    showArrows: Boolean,
    titleTopPadding: androidx.compose.ui.unit.Dp = 0.dp
) {
    if (evolutions.isEmpty()) return

    EvolutionTitle(
        title = title,
        modifier = Modifier.padding(top = titleTopPadding)
    )

    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(
            start = 0.dp,
            end = 32.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(if (showArrows) 12.dp else 18.dp)
    ) {
        itemsIndexed(evolutions) { index, evolution ->
            EvolutionListRow(
                index = index,
                evolution = evolution,
                evolutions = evolutions,
                showArrows = showArrows,
                selectedEvolutionNameForTransition = selectedEvolutionNameForTransition,
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = animatedVisibilityScope,
                onEvolutionClick = onEvolutionClick
            )
        }
    }
}

@Composable
private fun EvolutionTitle(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title,
        color = Color.White,
        fontFamily = montserratFamily,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,
        maxLines = 1,
        softWrap = false,
        overflow = TextOverflow.Clip,
        textAlign = TextAlign.Center,
        modifier = modifier
    )
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun EvolutionListRow(
    index: Int,
    evolution: PokemonSpecies,
    evolutions: List<PokemonSpecies>,
    showArrows: Boolean,
    selectedEvolutionNameForTransition: String?,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    onEvolutionClick: (PokemonSpecies) -> Unit
) {
    val previousEvolution = evolutions.getOrNull(index - 1)
    val shouldShowArrow = showArrows &&
            previousEvolution != null &&
            evolution.evolvesFromSpeciesId == previousEvolution.id

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(bottom = 20.dp)
    ) {
        when {
            shouldShowArrow -> EvolutionArrow()
            showArrows && index > 0 -> Spacer(modifier = Modifier.width(30.dp))
        }

        EvolutionPokemonItem(
            evolution = evolution,
            sharedTransitionScope = sharedTransitionScope,
            animatedVisibilityScope = animatedVisibilityScope,
            enableSharedTransition = selectedEvolutionNameForTransition == evolution.name,
            onClick = { onEvolutionClick(evolution) },
            showMethod = true,
            imageSize = NormalEvolutionImageSize,
            itemWidth = EvolutionItemWidth
        )
    }
}

@Composable
private fun EvolutionArrow() {
    Text(
        text = "➜",
        color = Color.White,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(horizontal = 6.dp)
    )
}
