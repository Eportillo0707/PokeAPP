package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.screens.pokemonList.composables.ImageLoading

import com.emerson.pokeapp.ui.theme.montserratFamily

@Composable
 fun PokemonImage(
    pokemonItem: PokemonItem
) {
    Box() {
        SubcomposeAsyncImage(
            model = pokemonItem.ImageUrl,
            contentDescription = "Pokemon Image",
            loading = { ImageLoading() },
            error = { },
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(350.dp)
                .align(Alignment.TopCenter)
                .padding(top = 20.dp)


        )
        Text(
            text = pokemonItem.name.replaceFirstChar { it.uppercase() },
            color = Color.White,
            fontSize = 50.sp,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Bold,
            maxLines = 1,
            softWrap = false,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(top = 320.dp)
                .fillMaxWidth()

        )
    }
}