package com.emerson.pokeapp.ui.screens.pokemonInfo.Composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emerson.pokeapp.domain.model.PokemonInfo

@Composable
fun PokemonSpecs(
    pokemon: PokemonInfo,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Height",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
            )
            Spacer(modifier = modifier.height(4.dp))
            Text(
                text = "${pokemon.height / 10f} m",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
            )
        }
        Spacer(modifier = modifier.width(30.dp))
        Box(
            modifier = Modifier
                .height(60.dp)
                .width(1.dp)
                .background(Color.White)
        )
        Spacer(modifier = modifier.width(30.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Weight",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
            )
            Spacer(modifier = modifier.height(4.dp))
            Text(
                text = "${pokemon.weight / 10f} kg",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
            )
        }
    }
}

