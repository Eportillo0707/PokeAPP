package com.emerson.pokeapp.ui.screens.pokemonList.composables

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.TypeIcons
import com.emerson.pokeapp.ui.theme.montserratFamily
import com.emerson.pokeapp.ui.utils.formatPokemonName
import kotlinx.coroutines.launch

private val CardWidth = 150.dp
private val PokemonImageSize = 100.dp

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun PokemonListItem(
    modifier: Modifier = Modifier,
    pokemonItem: PokemonItem,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    enableSharedTransition: Boolean = true,
    onCLick: () -> Unit = {}
) {
    val scale = remember { Animatable(1f) }
    val coroutineScope = rememberCoroutineScope()
    val interactionSource = remember { MutableInteractionSource() }

    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF202339)),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        border = CardDefaults.outlinedCardBorder(),
        modifier = Modifier
            .width(CardWidth)
            .padding(8.dp)
            .scale(scale.value)
            .clickable(
                interactionSource = interactionSource,
                indication = null
            ) {
                coroutineScope.launch {
                    scale.animateTo(
                        targetValue = 0.94f,
                        animationSpec = tween(durationMillis = 80)
                    )
                    scale.animateTo(
                        targetValue = 1f,
                        animationSpec = tween(durationMillis = 90)
                    )
                    onCLick()
                }
            }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(8.dp)
        ) {
            PokemonCardImage(
                pokemonItem = pokemonItem,
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = animatedVisibilityScope,
                enableSharedTransition = enableSharedTransition
            )

            PokemonCardName(name = pokemonItem.name)

            PokemonCardTypes(types = pokemonItem.pokemonTypes)

            Spacer(modifier = Modifier.height(4.dp))
        }
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun PokemonCardImage(
    pokemonItem: PokemonItem,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope,
    enableSharedTransition: Boolean
) {
    with(sharedTransitionScope) {
        val imageModifier = if (enableSharedTransition) {
            Modifier.sharedElement(
                sharedContentState = rememberSharedContentState(
                    key = "pokemon-image-${pokemonItem.name}"
                ),
                animatedVisibilityScope = animatedVisibilityScope
            )
        } else {
            Modifier
        }

        SubcomposeAsyncImage(
            model = pokemonItem.ImageUrl,
            contentDescription = "Pokemon Image",
            loading = { ImageLoading() },
            error = { },
            contentScale = ContentScale.Fit,
            modifier = imageModifier
                .size(PokemonImageSize)
                .padding(top = 8.dp)
        )
    }
}

@Composable
private fun PokemonCardName(name: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        BasicText(
            text = formatPokemonName(name),
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
    }
}

@Composable
private fun PokemonCardTypes(types: List<String>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min)
            .padding(top = 10.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        types.forEach { type ->
            val iconId = TypeIcons[type.lowercase()]

            if (iconId != null) {
                Box(contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = iconId),
                        contentDescription = type,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier.width(75.dp)
                    )
                }
            }
        }
    }
}
