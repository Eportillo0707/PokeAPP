package com.emerson.pokeapp.ui.screens.pokemonList

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.components.PokemonListItem
import com.emerson.pokeapp.ui.theme.PokeAppTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun PokemonListScreen(
    viewModel: PokemonListViewModel,
    navController: NavController,

) {
    ScreenContent(
        pokemonList = viewModel.pokemonItem,
        onSearchClick = { navController.navigate("searchPokemon") },
        onPokemonClick = { pokemonName ->
            navController.navigate("pokemonInfo/$pokemonName")
        }


    )
}

@Composable
private fun ScreenContent(
    pokemonList: StateFlow<PagingData<PokemonItem>>,
    onSearchClick: () -> Unit,
    onPokemonClick: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121422)),
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        SearchButton(
            onSearchClick = onSearchClick
        )
        Spacer(modifier = Modifier.height(10.dp))
        ListItem(
            pokemonList = pokemonList,
            onClick = onPokemonClick
        )
    }

}

@Composable
private fun SearchButton(
    onSearchClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        contentAlignment = Alignment.Center

    ) {
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(36.dp)
                .border(0.5.dp, Color.Gray, RoundedCornerShape(12.dp)),
        ) {
            Button(
                onClick = onSearchClick,
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color(0xFF232B4C),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp),
                contentPadding = PaddingValues(0.dp),
                modifier = Modifier.fillMaxWidth()


            ) {
                Text(
                    text = "Search",
                    style = MaterialTheme.typography.titleMedium,

                    )
            }
        }

    }
}

@Composable
private fun ColumnScope.ListItem(
    pokemonList: StateFlow<PagingData<PokemonItem>>,
    onClick: (String) -> Unit
) {
    val pokemonState = pokemonList.collectAsLazyPagingItems()

    when (pokemonState.loadState.refresh) {
        is LoadState.Loading -> {
            AppLoading(modifier = Modifier.align(Alignment.CenterHorizontally))
        }

        is LoadState.Error -> {
            AppError(
                onRetryClick = { pokemonState.retry() }
            )
        }

        is LoadState.NotLoading -> {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF121422)),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)

            ) {
                items(pokemonState.itemCount) { index ->
                    val pokemon = pokemonState[index]
                    if (pokemon != null) {
                        PokemonListItem(
                            pokemonItem = pokemon,
                            onCLick = {onClick(pokemon.name)}

                        )
                    }


                }
            }
        }
    }

}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun ScreenPreview() {

    PokeAppTheme {
        val pokemonList = MutableStateFlow(
            PagingData.from(
                listOf(
                    PokemonItem(
                        name = "Pikachu",
                        id = 1,
                        pokemonTypes = listOf("Grass", "Poison")
                    )

                )


            )
        )
        ScreenContent(
            pokemonList = pokemonList,
            onSearchClick = {},
            onPokemonClick = {}
        )

    }
}

