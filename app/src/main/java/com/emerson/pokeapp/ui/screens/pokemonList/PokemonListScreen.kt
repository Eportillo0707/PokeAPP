package com.emerson.pokeapp.ui.screens.pokemonList

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.WhitePoint
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
    navController: NavController
) {
    ScreenContent(
        pokemonList = viewModel.pokemonItem,
        onSearchClick = { navController.navigate("searchPokemon") }


    )


}

@Composable
private fun ScreenContent(
    pokemonList: StateFlow<PagingData<PokemonItem>>,
    onSearchClick: () -> Unit = {}
) {
    Column(modifier = Modifier.fillMaxSize()
        .background(Color(0xFF77BDFE)),
    ) {
        SearchButton(
            onSearchClick = onSearchClick
        )

        ListItem(
            pokemonList = pokemonList
        )
    }

}

@Composable
private fun SearchButton(
    onSearchClick: () -> Unit
) {
    Button(
        onClick = onSearchClick,
        colors = ButtonDefaults.elevatedButtonColors(
            containerColor = Color.White,
            contentColor = Color.Black
        ),
        modifier = Modifier
            .fillMaxWidth(),

    ) {
        Text(
            text = "Search".uppercase(),
            style = MaterialTheme.typography.titleLarge,

        )
    }
}

@Composable
private fun ColumnScope.ListItem(
    pokemonList: StateFlow<PagingData<PokemonItem>>,
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
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF77BDFE))


            ) {
                items(
                    count = pokemonState.itemCount,
                    key = { index -> "pokemon_${pokemonState[index]?.name}" },
                    contentType = { index -> "pokemon_${pokemonState[index]?.name}" }
                ) { index ->
                    val item = pokemonState[index] ?: return@items

                    PokemonListItem(
                        pokemonItem = item
                    )

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
            pokemonList = pokemonList
        )

    }
}

