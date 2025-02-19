package com.emerson.pokeapp.ui.screens.searchPokemon
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.paging.PagingData
import androidx.paging.compose.collectAsLazyPagingItems
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.components.AppError
import com.emerson.pokeapp.ui.components.AppLoading
import com.emerson.pokeapp.ui.components.PokemonListItem
import com.emerson.pokeapp.ui.utils.UiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

@Composable
fun SearchPokemonScreen(
    viewModel: SearchPokemonViewModel,
    navController: NavController
) {
    ScreenContent(
        onQueryChanged = viewModel::onSearchQueryChanged,
        searchResultState = viewModel.searchResultState,
        onRetryClick = { },
        onPokemonClick = { pokemonName ->
            navController.navigate("pokemonInfo/$pokemonName")
        }
    )

}

@Composable
private fun ScreenContent(
    onQueryChanged: (String) -> Unit,
    searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>>,
    onPokemonClick: (String) -> Unit,
    onRetryClick: () -> Unit
) {

    val textFieldFocusRequester = remember { FocusRequester() }
    LaunchedEffect(Unit) {
        textFieldFocusRequester.requestFocus()
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121422))

    ) {
        var text by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.height(10.dp))

        BasicTextField(
            value = text,
            onValueChange = {
                text = it
                onQueryChanged(it)
            },
            modifier = Modifier
                .width(350.dp)
                .height(36.dp)
                .align(Alignment.CenterHorizontally)
                .border(0.5.dp, Color.Gray, RoundedCornerShape(12.dp))
                .background(Color(0xFF232B4C), RoundedCornerShape(12.dp))
                .focusRequester(textFieldFocusRequester)
                .padding(horizontal = 12.dp, vertical = 6.dp),

            textStyle = TextStyle(color = Color.White, fontSize = 14.sp),

            decorationBox = { innerTextField ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        modifier = Modifier.size(18.dp),
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Box(modifier = Modifier.weight(1f)) {
                        if (text.isEmpty()) {
                            Text("Search", color = Color.LightGray, fontSize = 14.sp)
                        }
                        innerTextField()
                    }
                }
            }
        )
        Spacer(modifier = Modifier.height(10.dp))
        PokemonList(
            searchResultState = searchResultState,
            onClick = onPokemonClick
        )


    }
}

@Composable
private fun ColumnScope.PokemonList(
    searchResultState: StateFlow<UiState<Flow<PagingData<PokemonItem>>>>,
    onClick: (String) -> Unit

    ) {
    val state by searchResultState.collectAsState()

    when (val result = state) {
        UiState.Loading -> {
            AppLoading(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 20.dp)
            )
        }

        is UiState.Error -> {
            Spacer(modifier = Modifier.height(20.dp))
            AppError()
        }

        is UiState.Result -> {
            val paginItems = result.data.collectAsLazyPagingItems()

           LazyVerticalGrid(
               columns = GridCells.Fixed(2),
               modifier = Modifier
                   .fillMaxWidth()
                   .background(Color(0xFF121422)),
               contentPadding = PaddingValues(8.dp),
               verticalArrangement = Arrangement.spacedBy(8.dp),
               horizontalArrangement = Arrangement.spacedBy(8.dp)
           ) {
               items(paginItems.itemCount) { index ->
                   val pokemon = paginItems[index]
                   if (pokemon != null) {
                       PokemonListItem(pokemonItem = pokemon,
                           onCLick = {onClick(pokemon.name)}
                       )
                   }
               }

           }
        }

    }

}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun ScreenPreview() {

}