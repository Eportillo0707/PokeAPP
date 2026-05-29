package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.TextAutoSize
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.BuildConfig
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonSpecies
import com.emerson.pokeapp.ui.screens.pokemonList.composables.ImageLoading
import com.emerson.pokeapp.ui.theme.montserratFamily
import com.emerson.pokeapp.ui.utils.formatPokemonName
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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

            navController.navigate(
                "pokemonInfo/${evolution.name}?pokemonId=${evolution.id}"
            )

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

            if (normalEvolutionLine.isNotEmpty()) {
                Text(
                    text = "Evolution Chain",
                    color = Color.White,
                    fontFamily = montserratFamily,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    softWrap = false,
                    overflow = TextOverflow.Clip,
                    textAlign = TextAlign.Center
                )

                LazyRow(
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(
                        start = 0.dp,
                        end = 32.dp
                    ),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    itemsIndexed(normalEvolutionLine) { index, evolution ->

                        val previousEvolution = normalEvolutionLine.getOrNull(index - 1)

                        val shouldShowArrow = previousEvolution != null &&
                                evolution.evolvesFromSpeciesId == previousEvolution.id

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(bottom = 20.dp)
                        ) {
                            if (shouldShowArrow) {
                                Text(
                                    text = "➜",
                                    color = Color.White,
                                    fontSize = 32.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 6.dp)
                                )
                            } else if (index > 0) {
                                Spacer(modifier = Modifier.width(30.dp))
                            }

                            EvolutionPokemonItem(
                                evolution = evolution,
                                sharedTransitionScope = sharedTransitionScope,
                                animatedVisibilityScope = animatedVisibilityScope,
                                enableSharedTransition = selectedEvolutionNameForTransition == evolution.name,
                                onClick = {
                                    navigateWithEvolutionTransition(evolution)
                                },
                                imageSize = 115.dp,
                                itemWidth = 155.dp
                            )
                        }
                    }
                }
            }
        }

        val megaEvolutions = pokemon.megaEvolutions
            .ifEmpty {
                pokemon.evolutionChain
                    .flatten()
                    .filter { it.name.contains("-mega", ignoreCase = true) }
            }
            .distinctBy { it.name }
            .sortedBy { it.id }

        if (megaEvolutions.isNotEmpty()) {
            Text(
                text = "Mega Evolutions",
                color = Color.White,
                fontFamily = montserratFamily,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                softWrap = false,
                overflow = TextOverflow.Clip,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp)
            )

            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(
                    start = 0.dp,
                    end = 32.dp
                ),
                horizontalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                itemsIndexed(megaEvolutions) { _, mega ->
                    EvolutionPokemonItem(
                        evolution = mega,
                        sharedTransitionScope = sharedTransitionScope,
                        animatedVisibilityScope = animatedVisibilityScope,
                        enableSharedTransition = selectedEvolutionNameForTransition == mega.name,
                        onClick = {
                            navigateWithEvolutionTransition(mega)
                        },
                        showMethod = true,
                        imageSize = 115.dp,
                        itemWidth = 155.dp
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun EvolutionPokemonItem(
    evolution: PokemonSpecies,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    enableSharedTransition: Boolean,
    onClick: () -> Unit,
    showMethod: Boolean = true,
    imageSize: Dp = 115.dp,
    itemWidth: Dp = 155.dp
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(itemWidth)
            .padding(bottom = 20.dp)
    ) {
        with(sharedTransitionScope) {
            val imageModifier = Modifier
                .size(imageSize)
                .clickable {
                    onClick()
                }

            Box(
                contentAlignment = Alignment.Center,
                modifier = if (enableSharedTransition) {
                    imageModifier.sharedElement(
                        sharedContentState = rememberSharedContentState(
                            key = "pokemon-image-${evolution.name}"
                        ),
                        animatedVisibilityScope = animatedVisibilityScope
                    )
                } else {
                    imageModifier
                }
            ) {
                SubcomposeAsyncImage(
                    model = String.format(
                        BuildConfig.POKEMON_IMAGE_URL,
                        evolution.id
                    ),
                    contentDescription = "Pokemon Image",
                    loading = { ImageLoading() },
                    error = { },
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }

        BasicText(
            text = formatPokemonName(evolution.name),
            style = TextStyle(
                color = Color.White,
                fontFamily = montserratFamily,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
            maxLines = 1,
            softWrap = false,
            autoSize = TextAutoSize.StepBased(
                minFontSize = 10.sp,
                maxFontSize = 20.sp
            ),
            modifier = Modifier.fillMaxWidth()
        )

        if (showMethod && !evolution.evolutionMethod.isNullOrBlank()) {
            EvolutionMethodLabel(
                method = evolution.evolutionMethod,
                itemImageUrl = evolution.evolutionItemImageUrl,
                itemWidth = itemWidth
            )
        }
    }
}

@Composable
private fun EvolutionMethodLabel(
    method: String,
    itemImageUrl: String?,
    itemWidth: Dp
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .width(itemWidth)
            .padding(top = 4.dp)
    ) {
        if (!itemImageUrl.isNullOrBlank()) {
            SubcomposeAsyncImage(
                model = itemImageUrl,
                contentDescription = method,
                loading = { },
                error = { },
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 2.dp)
            )
        }

        BasicText(
            text = method,
            style = TextStyle(
                color = Color.White.copy(alpha = 0.75f),
                fontFamily = montserratFamily,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center
            ),
            maxLines = 1,
            softWrap = false,
            autoSize = TextAutoSize.StepBased(
                minFontSize = 7.sp,
                maxFontSize = 13.sp
            ),
            modifier = Modifier.weight(1f)
        )
    }
}