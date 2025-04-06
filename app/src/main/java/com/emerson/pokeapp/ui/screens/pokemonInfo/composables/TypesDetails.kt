package com.emerson.pokeapp.ui.screens.pokemonInfo.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emerson.pokeapp.domain.model.TypeEffectiveness
import com.emerson.pokeapp.domain.model.TypeIcons
import com.emerson.pokeapp.ui.theme.montserratFamily

@Composable
fun TypesDetails(
    resistances: TypeEffectiveness,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(start = 20.dp, end = 20.dp, top = 10.dp)
    ) {
        Text(
            text = "Resistances",
            color = Color.White,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
        )
        if (resistances.resistantTo.isNotEmpty()) {
            Text(
                text = "1/2x From:",
                color = Color.White,
                fontFamily = montserratFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                items(resistances.resistantTo.size) { index ->
                    val type = resistances.resistantTo[index]
                    TypeIcons[type.lowercase()]?.let { iconId ->
                        Image(
                            painter = painterResource(id = iconId),
                            contentDescription = null,
                            modifier = modifier
                                .width(100.dp)
                                .height(30.dp)
                        )
                    }
                }
            }
        }

        if (resistances.veryResistantTo.isNotEmpty()) {
            Text(
                text = "1/4x From:",
                color = Color.White,
                fontFamily = montserratFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                items(resistances.veryResistantTo.size) { index ->
                    val type = resistances.veryResistantTo[index]
                    TypeIcons[type.lowercase()]?.let { iconId ->
                        Image(
                            painter = painterResource(id = iconId),
                            contentDescription = null,
                            modifier = modifier
                                .width(100.dp)
                                .height(30.dp)
                        )
                    }
                }
            }
        }
        if (resistances.immuneTo.isNotEmpty()) {

            Text(
                text = "Immunities:",
                color = Color.White,
                fontFamily = montserratFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier


            ) {
                items(resistances.immuneTo.size) { index ->
                    val type = resistances.immuneTo[index]
                    TypeIcons[type.lowercase()]?.let { iconId ->
                        Image(
                            painter = painterResource(id = iconId),
                            contentDescription = null,
                            modifier = modifier
                                .width(100.dp)
                                .height(30.dp)
                        )
                    }
                }
            }

        }
    }


    if (resistances.weakTo.isNotEmpty()) {
        Column(
            modifier = modifier
                .padding(start = 20.dp, end = 20.dp, top = 10.dp)
        ) {
            Text(
                text = "Weaknesses",
                color = Color.White,
                fontFamily = montserratFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
            )
            if (resistances.veryWeakTo.isNotEmpty()) {
                Text(
                    text = "4x From:",
                    color = Color.White,
                    fontFamily = montserratFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    items(resistances.veryWeakTo.size) { index ->
                        val type = resistances.veryWeakTo[index]
                        TypeIcons[type.lowercase()]?.let { iconId ->
                            Image(
                                painter = painterResource(id = iconId),
                                contentDescription = null,
                                modifier = modifier
                                    .width(100.dp)
                                    .height(30.dp)
                            )
                        }
                    }

                }
            }
            Text(
                text = "2x From:",
                color = Color.White,
                fontFamily = montserratFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
            )

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                items(resistances.weakTo.size) { index ->
                    val type = resistances.weakTo[index]
                    TypeIcons[type.lowercase()]?.let { iconId ->
                        Image(
                            painter = painterResource(id = iconId),
                            contentDescription = null,
                            modifier = modifier
                                .width(100.dp)
                                .height(30.dp)
                        )
                    }
                }
            }

        }
    }
    Spacer(modifier = Modifier.height(10.dp))


}