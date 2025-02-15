package com.emerson.pokeapp.ui.components


import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.ui.theme.PokeAppTheme

@Composable
fun PokemonListItem(

    modifier: Modifier = Modifier,
    pokemonItem: PokemonItem,
    name: String = "",
    id: Int = 0,
    pokemonTypes: List<String> = emptyList()
) {
    Card(
        shape = RoundedCornerShape(corner = CornerSize(10.dp)),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
        modifier = Modifier
            .padding(horizontal = 12.dp, vertical = 12.dp)
            .fillMaxWidth()


    ) {
        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 5.dp)
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically


        ) {
            SubcomposeAsyncImage(
                model = pokemonItem.ImageUrl,
                contentDescription = "Pokemon Image",
                loading = { ImageLoading() },
                error = { },
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(width = 120.dp, height = 120.dp)

            )

            Column(
                modifier = modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = pokemonItem.name.uppercase(),
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.Black
                )
                Text(
                    text = "ID: ${pokemonItem.id}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )
                Text(
                    text = "Types: ${pokemonItem.pokemonTypes.joinToString(", ").uppercase()}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black
                )

            }
        }
    }

}

@Composable
fun ImageLoading() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = MaterialTheme.colorScheme.surfaceVariant
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