package com.emerson.pokeapp.ui.screens.pokemonInfo

import androidx.compose.animation.animateContentSize
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
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.TypeEffectiveness
import com.emerson.pokeapp.domain.model.TypeIcons
import com.emerson.pokeapp.domain.model.getPokemonTypeColor
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.EvolutionChain
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.FavoriteButton
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.PokemonImage
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.PokemonSpecs
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.Stats
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.TopCircle
import com.emerson.pokeapp.ui.screens.pokemonInfo.composables.TypesDetails
import com.emerson.pokeapp.ui.theme.montserratFamily
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.launch

@Composable
fun PokemonInfoScreen(
    viewModel: PokemonInfoViewModel,
    navController: NavController,

    ) {
    val pokemonState = viewModel.pokemonInfo.collectAsState()
    val resistances = viewModel.resistances.collectAsState()
    when (val state = pokemonState.value) {
        is UiState.Loading -> {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF121422))
            )
            AppLoading()
        }

        is UiState.Error -> {
            AppError()
        }

        is UiState.Result -> {
            val pokemon = state.data

            PokemonItem(
                name = pokemon.name,
                id = pokemon.id,
                pokemonTypes = pokemon.types,
                isFavored = pokemon.isFavored
            )


            ScreenContent(
                pokemon = pokemon,
                resistances = resistances.value,
                navController = navController,
                pokemonItem = PokemonItem(
                    name = pokemon.name,
                    id = pokemon.id,
                    pokemonTypes = pokemon.types
                ),
                onFavoriteClick = {
                    viewModel.onFavoriteButtonClicked()

                }
            )
        }
    }
}

@Composable
private fun ScreenContent(
    pokemon: PokemonInfo,
    resistances: TypeEffectiveness,
    pokemonItem: PokemonItem,
    navController: NavController,
    modifier: Modifier = Modifier,
    onFavoriteClick: () -> Unit = {}
) {
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { 2 })
    val coroutineScope = rememberCoroutineScope()
    val typeColors = remember { pokemon.types.map { getPokemonTypeColor(it) } }
    val lazyListState = rememberLazyListState()
    LaunchedEffect(pokemon.id) {
        lazyListState.animateScrollToItem(0)
    }
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF121422))

    ) {

        Column(
            modifier = modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF121422))

            ) {
                IconButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }
                Text(
                    text = "Pokemon Info",
                    color = Color.LightGray,
                    fontFamily = montserratFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

            LazyColumn(
                state = lazyListState,
                modifier = modifier
                    .fillMaxSize()
                    .background(Color(0xFF121422))
            ) {
                item {

                    Box(
                    ) {

                        TopCircle(
                            typeColors = typeColors,
                        )
                        FavoriteButton(
                            icon = if (pokemonItem.isFavored) Icons.Filled.Star else Icons.Outlined.StarBorder,
                            isSelected = pokemon.isFavored,
                            onCLick = onFavoriteClick,

                            )


                        PokemonImage(
                            pokemonItem = pokemonItem
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

                }
                item {
                    Spacer(modifier = Modifier.height(15.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        IconButton(
                            onClick = { coroutineScope.launch { pagerState.animateScrollToPage(0) } }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Info,
                                contentDescription = "Info",
                                tint = Color.White,
                                modifier = Modifier.size(40.dp)
                            )
                        }
                        IconButton(
                            onClick = { coroutineScope.launch { pagerState.animateScrollToPage(1) } }
                        ) {
                            Icon(
                                imageVector = Icons.Default.BarChart,
                                contentDescription = "Stats",
                                tint = Color.White,
                                modifier = Modifier.size(40.dp)
                            )
                        }
                    }

                    HorizontalPager(
                        state = pagerState,
                        beyondViewportPageCount = 1,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp)
                            .animateContentSize()
                            .height(700.dp)


                    ) { page ->
                        Card(
                            shape = RoundedCornerShape(20.dp),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF202339)),
                            elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
                            border = CardDefaults.outlinedCardBorder(),
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 10.dp, vertical = 10.dp)) {
                            when (page) {
                                0 -> Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .animateContentSize()
                                ) {
                                    PokemonSpecs(pokemon = pokemon)
                                    Spacer(modifier = Modifier.height(30.dp))
                                    EvolutionChain(pokemon = pokemon, navController = navController)
                                }

                                1 -> Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .animateContentSize()

                                ) {
                                    Stats(pokemon = pokemon)
                                    TypesDetails(resistances = resistances)
                                }
                            }
                        }


                    }

                }

            }
        }
    }

}


