package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emerson.pokeapp.domain.model.PokemonAbility
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.ui.theme.montserratFamily

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun PokemonSpecs(
    pokemon: PokemonInfo,
    modifier: Modifier = Modifier
) {
    val bottomSheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember { mutableStateOf(false) }
    var selectedAbility by remember { mutableStateOf<PokemonAbility?>(null) }

    if (showBottomSheet && selectedAbility != null) {
        ModalBottomSheet(
            onDismissRequest = { showBottomSheet = false },
            sheetState = bottomSheetState,
            containerColor = Color(0xFF232B4C)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            ) {
                Text(
                    text = selectedAbility!!.name.replace("-", " ")
                        .replaceFirstChar { it.uppercase() },
                    color = Color.White,
                    fontFamily = montserratFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = selectedAbility!!.flavorText,
                    color = Color.White,
                    fontFamily = montserratFamily,
                    fontWeight = FontWeight.Normal,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier
                        .padding(bottom = 15.dp)

                )
            }
        }

    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 25.dp, start = 12.dp, end = 12.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Description",
            color = Color.White,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )
        Text(
            text = pokemon.description,
            color = Color.White,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify,
            lineHeight = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = modifier.height(30.dp))
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
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
                fontFamily = montserratFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
            )
        }
        Spacer(modifier = modifier.width(80.dp))
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
                fontFamily = montserratFamily,
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
    Spacer(modifier = modifier.height(30.dp))
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 12.dp, end = 12.dp, top = 10.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Abilities",
            color = Color.White,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(5.dp),
            modifier = modifier
                .fillMaxWidth()

        ) {
            pokemon.abilities.forEach { ability ->
                TextButton(
                    onClick = {
                        selectedAbility = ability
                        showBottomSheet = true
                    },
                    colors = ButtonDefaults.buttonColors(Color(0xFF232B4C))

                ) {
                    Text(
                        text = ability.name
                            .replace("-", " ")
                            .replaceFirstChar { it.uppercase() },
                        color = Color.White,
                        fontFamily = montserratFamily,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 15.sp,
                    )
                }

            }
        }
    }
}

