package com.emerson.pokeapp.ui.screens.pokemonInfo
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.TypeIcons
import com.emerson.pokeapp.domain.model.getPokemonTypeColor
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.screens.pokemonInfo.Composables.EvolutionChain
import com.emerson.pokeapp.ui.screens.pokemonInfo.Composables.Stats
import com.emerson.pokeapp.ui.screens.pokemonInfo.Composables.TopCircle
import com.emerson.pokeapp.ui.screens.pokemonInfo.Composables.PokemonImage
import com.emerson.pokeapp.ui.screens.pokemonInfo.Composables.PokemonSpecs
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
            .padding(bottom = 25.dp)
    ) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .background(Color(0xFF121422))
        ) {
            item {
                Box(
                    modifier = modifier
                        .size(550.dp),
                    contentAlignment = Alignment.Center
                ) {
                    TopCircle(
                        typeColors = typeColors,
                    )
                    PokemonImage(
                        pokemonItem = pokemonItem
                    )
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(top = 445.dp),
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
                }
                PokemonSpecs(
                    pokemon = pokemon,
                )
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