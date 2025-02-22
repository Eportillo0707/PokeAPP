package com.emerson.pokeapp.ui.screens.pokemonInfo.Composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun FavoriteButton(
    icon: ImageVector,
    isSelected: Boolean,
    onCLick: () -> Unit,
    modifier: Modifier = Modifier

) {
    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = modifier
            .fillMaxWidth()

    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = if (isSelected) {
                Color.Yellow
            } else {
                Color.LightGray
            },
            modifier = Modifier
                .size(60.dp)
                .padding(end = 15.dp)
                .clickable { onCLick() }


        )
    }
}