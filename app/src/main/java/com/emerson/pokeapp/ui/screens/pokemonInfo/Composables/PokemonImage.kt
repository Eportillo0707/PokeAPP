package com.emerson.pokeapp.ui.screens.pokemonInfo.Composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.screens.pokemonList.Composables.ImageLoading

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
}