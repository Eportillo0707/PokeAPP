package com.emerson.pokeapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.emerson.pokeapp.R

val montserratFamily = FontFamily(
    Font(R.font.montserrat_regular, FontWeight.Normal),
    Font(R.font.montserrat_bold, FontWeight.Bold),
    Font(R.font.montserrat_light, FontWeight.Light)
)

val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = montserratFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = montserratFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    labelSmall = TextStyle(
        fontFamily = montserratFamily,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    )
)
