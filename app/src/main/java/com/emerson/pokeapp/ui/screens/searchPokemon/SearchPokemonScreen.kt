package com.emerson.pokeapp.ui.screens.searchPokemon

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.navigation.AppRoutes
import com.emerson.pokeapp.ui.screens.searchPokemon.composables.PokemonList
import com.emerson.pokeapp.ui.screens.searchPokemon.composables.SearchPokemonBar
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SearchPokemonScreen(
    viewModel: SearchPokemonViewModel,
    navController: NavController,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    val query by viewModel.searchQuery.collectAsState()

    SearchPokemonContent(
        query = query,
        navController = navController,
        onQueryChanged = viewModel::onSearchQueryChanged,
        searchResultState = viewModel.searchResultState,
        sharedTransitionScope = sharedTransitionScope,
        animatedVisibilityScope = animatedVisibilityScope
    )
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun SearchPokemonContent(
    query: String,
    onQueryChanged: (String) -> Unit,
    searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>>,
    navController: NavController,
    sharedTransitionScope: SharedTransitionScope,
    animatedVisibilityScope: AnimatedVisibilityScope
) {
    val focusRequester = remember { FocusRequester() }
    val coroutineScope = rememberCoroutineScope()
    val gridState = rememberLazyGridState()

    var selectedPokemonNameForTransition by rememberSaveable {
        mutableStateOf<String?>(null)
    }

    fun navigateWithSharedTransition(pokemon: PokemonItem) {
        selectedPokemonNameForTransition = pokemon.name

        coroutineScope.launch {
            delay(60)

            navController.navigate(
                "pokemonInfo/${pokemon.name}?pokemonId=${pokemon.id}"
            )
        }
    }

    LaunchedEffect(Unit) {
        focusRequester.requestFocus()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121422))
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        SearchPokemonBar(
            text = query,
            focusRequester = focusRequester,
            onTextChange = { value ->
                onQueryChanged(value)
            },
            onTypeSelected = { type ->
                navController.navigate(AppRoutes.pokemonListByType(type))
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(10.dp))

        PokemonList(
            searchResultState = searchResultState,
            onClick = { pokemon ->
                navigateWithSharedTransition(pokemon)
            },
            sharedTransitionScope = sharedTransitionScope,
            animatedVisibilityScope = animatedVisibilityScope,
            selectedPokemonNameForTransition = selectedPokemonNameForTransition,
            gridState = gridState
        )
    }
}