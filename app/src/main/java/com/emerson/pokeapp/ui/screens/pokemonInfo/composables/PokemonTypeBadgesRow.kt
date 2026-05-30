package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.emerson.pokeapp.domain.model.TypeIcons

@Composable
fun PokemonTypeBadgesRow(
    types: List<String>,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.Center
    ) {
        types.forEach { type ->
            val iconId = TypeIcons[type.lowercase()]

            if (iconId != null) {
                Box(contentAlignment = Alignment.Center) {
                    Image(
                        painter = painterResource(id = iconId),
                        contentDescription = type,
                        modifier = Modifier
                            .width(150.dp)
                            .height(60.dp)
                            .padding(horizontal = 10.dp)
                    )
                }
            }
        }
    }
}
