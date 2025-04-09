package com.emerson.pokeapp.ui.screens.pokemonList.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emerson.pokeapp.domain.model.PokemonTypes
import com.emerson.pokeapp.ui.theme.montserratFamily

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FilterContent(
    modifier: Modifier = Modifier,
    onTypeSelected: (String) -> Unit = {}

) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical =50.dp)

    ) {
        Text(
            text = "Select a Type",
            color = Color.White,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier.padding(bottom = 15.dp)
        )

        LazyVerticalGrid (
            columns = GridCells.Fixed(4),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = modifier
                .fillMaxWidth()
                .heightIn(max = 500.dp)
        ) {
            items(PokemonTypes){ (type, icon) ->
                IconButton(
                    onClick = { onTypeSelected(type) },
                    modifier = Modifier
                        .size(70.dp)
                        .background(Color.Transparent)
                ) {
                    Icon(
                        painter = painterResource(id = icon),
                        contentDescription = type,
                        tint = Color.Unspecified,
                        modifier = Modifier.size(70.dp)
                    )
                }

            }
        }
    }
}