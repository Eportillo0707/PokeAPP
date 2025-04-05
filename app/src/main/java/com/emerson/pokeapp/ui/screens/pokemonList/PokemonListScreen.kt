package com.emerson.pokeapp.ui.screens.pokemonList

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.screens.pokemonList.composables.HeaderButtons
import com.emerson.pokeapp.ui.screens.pokemonList.composables.ListItem
import com.emerson.pokeapp.ui.theme.PokeAppTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

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
    onPokemonClick: (String) -> Unit,

) {

    val listState = rememberLazyGridState()
    val coroutineScope = rememberCoroutineScope()
    var showButton by remember { mutableStateOf(false) }
    LaunchedEffect(listState.firstVisibleItemIndex) {
        showButton = listState.firstVisibleItemIndex > 0
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF121422)),
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            HeaderButtons(
                onSearchClick = onSearchClick
            )
            Spacer(modifier = Modifier.height(10.dp))
            ListItem(
                pokemonList = pokemonList,
                onClick = onPokemonClick,
                listState = listState
            )
        }
        if (showButton) {
            FloatingActionButton(
                onClick = {
                    coroutineScope.launch {
                        listState.animateScrollToItem(0)
                    }
                },
                containerColor = Color(0xFF232B4C),
                contentColor = Color.White,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(end = 8.dp, top = 75.dp)
            ) {
                Icon(Icons.Default.ArrowUpward, contentDescription = "Scroll to Top")
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

