package com.emerson.pokeapp.ui.screens.pokemonList.Composables

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HeaderButtons(
    onSearchClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        contentAlignment = Alignment.Center

    ) {

        Row(
            modifier = Modifier.width(350.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)

        ) {
            Box(
                modifier = Modifier.weight(1f)
                    .height(32.dp)
                    .border(0.5.dp, Color.Gray, RoundedCornerShape(12.dp))
            ) {
                Button(
                    onClick = onSearchClick,
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = Color(0xFF232B4C),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.fillMaxWidth()


                ) {
                    Text(
                        text = "Search",
                        style = MaterialTheme.typography.titleMedium,

                        )
                }
            }
            Box(
                modifier = Modifier.weight(1f)
                    .height(32.dp)
                    .border(0.5.dp, Color.Gray, RoundedCornerShape(12.dp))
            ) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = Color(0xFF232B4C),
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(12.dp),
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.fillMaxWidth()


                ) {
                    Text(
                        text = "Favorites",
                        style = MaterialTheme.typography.titleMedium,

                        )
                }
            }

        }
    }
}