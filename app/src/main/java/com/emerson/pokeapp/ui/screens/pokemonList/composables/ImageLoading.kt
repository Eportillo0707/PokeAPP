package com.emerson.pokeapp.ui.screens.pokemonList.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

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