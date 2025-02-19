package com.emerson.pokeapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.BuildConfig
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem

@Composable
fun EvolutionChain(
    pokemon: PokemonInfo,
    modifier: Modifier = Modifier,
    navController: NavController
){
    pokemon.evolutionChain.forEach { evolutionLine ->
        val filterEvolutionLine = evolutionLine.sortedBy { it.id }
            .filter { it.id != pokemon.id }
        if (filterEvolutionLine.isNotEmpty()) {
            Column(
                modifier = modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "EVOLUTIONS",
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    softWrap = false,
                    overflow = TextOverflow.Clip,
                    textAlign = TextAlign.Center
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(25.dp)
                ) {
                    items(filterEvolutionLine) { evolution ->
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            SubcomposeAsyncImage(
                                model = String.format(
                                    BuildConfig.POKEMON_IMAGE_URL, evolution.id
                                ),
                                contentDescription = "Pokemon Image",
                                loading = { ImageLoading() },
                                error = { },
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .size(150.dp)
                                    .clickable {
                                        navController.navigate("pokemonInfo/${evolution.name}") {
                                            popUpTo("pokemonList")
                                            launchSingleTop = true
                                        }

                                    }
                            )
                            Text(
                                text = evolution.name.uppercase(),
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                maxLines = 1,
                                softWrap = false,
                                overflow = TextOverflow.Clip,
                                textAlign = TextAlign.Center
                            )


                        }

                    }
                }
            }
        }
    }

}