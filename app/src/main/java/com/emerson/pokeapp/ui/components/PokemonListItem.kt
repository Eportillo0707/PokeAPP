package com.emerson.pokeapp.ui.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.TypeIcons
import com.emerson.pokeapp.ui.theme.PokeAppTheme

@Composable
fun PokemonListItem(
    modifier: Modifier = Modifier,
    pokemonItem: PokemonItem,
    onCLick: () -> Unit = {}

    ) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF202339)),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        border = CardDefaults.outlinedCardBorder(),
        modifier = Modifier
            .width(150.dp)
            .padding(8.dp)
            .clickable { onCLick() }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.padding(8.dp)
        ) {
            SubcomposeAsyncImage(
                model = pokemonItem.ImageUrl,
                contentDescription = "Pokemon Image",
                loading = { ImageLoading() },
                error = { },
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(100.dp)
                    .padding(top = 8.dp)
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = modifier.fillMaxWidth()
            ) {
                Text(
                    text = pokemonItem.name.uppercase(),
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    softWrap = false,
                    overflow = TextOverflow.Clip,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .scale(0.9f)
                )
            }
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min)
                    .padding(top = 10.dp, bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement =
                if (pokemonItem.pokemonTypes.size == 1) Arrangement.Center
                else Arrangement.spacedBy(8.dp)
            )
            {
                pokemonItem.pokemonTypes.forEach { type ->
                    val iconId = TypeIcons[type.lowercase()]
                    if (iconId != null) {
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = iconId),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = modifier
                                    .width(75.dp)
                            )
                        }
                    }
                }
            }
            Spacer(modifier = modifier.height(4.dp))
        }
    }
}

@Composable
fun ImageLoading() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color(0xFF202339)
            )
    )
}


@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun PokemonListItemPreview() {
    PokeAppTheme {
        PokemonListItem(
            pokemonItem = PokemonItem(
                name = "Bulbasaur",
                id = 1,
                pokemonTypes = listOf("Grass", "Poison")

            )

        )
    }
}