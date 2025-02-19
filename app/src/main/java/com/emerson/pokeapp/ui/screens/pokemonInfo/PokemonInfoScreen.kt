package com.emerson.pokeapp.ui.screens.pokemonInfo
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.TypeIcons
import com.emerson.pokeapp.domain.model.getPokemonTypeColor
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.components.EvolutionChain
import com.emerson.pokeapp.ui.components.ImageLoading
import com.emerson.pokeapp.ui.components.Stats
import com.emerson.pokeapp.ui.components.TopCircle
import com.emerson.pokeapp.ui.utils.UiState

@Composable
fun PokemonInfoScreen(
    viewModel: PokemonInfoViewModel,
    navController: NavController,
    pokemonName: String
) {
    when (val pokemonState = viewModel.pokemonInfo.collectAsState().value) {
        is UiState.Loading -> {
            AppLoading()
        }

        is UiState.Error -> {
            AppError()
        }

        is UiState.Result -> {
            val pokemon = pokemonState.data
            LaunchedEffect(pokemonName) {

            }
            ScreenContent(
                pokemon = pokemon,
                navController = navController,
                pokemonItem = PokemonItem(
                    name = pokemon.name,
                    id = pokemon.id,
                    pokemonTypes = pokemon.types
                ),
            )
        }
    }
}

@Composable
private fun ScreenContent(
    pokemon: PokemonInfo,
    pokemonItem: PokemonItem,
    navController: NavController,
    modifier: Modifier = Modifier,
) {

    val typeColors = remember {
        pokemon.types.map { getPokemonTypeColor(it) }
    }
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF121422))
    ) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFF121422))
        ) {
            item {
                Box(
                    modifier = modifier
                        .size(450.dp),
                    contentAlignment = Alignment.Center
                ) {
                    TopCircle(
                        typeColors = typeColors,
                    )
                    SubcomposeAsyncImage(
                        model = pokemonItem.ImageUrl,
                        contentDescription = "Pokemon Image",
                        loading = { ImageLoading() },
                        error = { },
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .size(350.dp)
                            .align(Alignment.TopCenter)
                            .padding(top = 100.dp)

                    )
                    Text(
                        text = pokemonItem.name.uppercase(),
                        color = Color.White,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        softWrap = false,
                        overflow = TextOverflow.Clip,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(top = 350.dp)
                            .fillMaxWidth()
                            .scale(0.9f)
                    )
                }
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalArrangement =
                    if (pokemonItem.pokemonTypes.size == 1) Arrangement.Center
                    else Arrangement.Center
                )
                {
                    pokemonItem.pokemonTypes.forEach { type ->
                        val iconId = TypeIcons[type.lowercase()]
                        if (iconId != null) {
                            Box(
                                contentAlignment = Alignment.Center,
                            ) {
                                Image(
                                    painter = painterResource(id = iconId),
                                    contentDescription = null,

                                    modifier = modifier
                                        .width(150.dp)
                                        .height(60.dp)
                                        .padding(horizontal = 10.dp)
                                )
                            }
                        }
                    }
                }

                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Height",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                        )
                        Spacer(modifier = modifier.height(4.dp))
                        Text(
                            text = "${pokemon.height / 10f} m",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                        )
                    }
                    Spacer(modifier = modifier.width(30.dp))
                    Box(
                        modifier = Modifier
                            .height(60.dp)
                            .width(1.dp)
                            .background(Color.White)
                    )
                    Spacer(modifier = modifier.width(30.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Weight",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp,
                        )
                        Spacer(modifier = modifier.height(4.dp))
                        Text(
                            text = "${pokemon.weight / 10f} kg",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                        )
                    }
                }
            }
            item {

                Stats(pokemon = pokemon)
            }
            item {
                EvolutionChain(
                    pokemon = pokemon,
                    navController = navController
                )
            }
        }
    }
}





