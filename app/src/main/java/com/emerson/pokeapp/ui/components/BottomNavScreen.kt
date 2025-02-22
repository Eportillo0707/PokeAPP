package com.emerson.pokeapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
){
    data object PokemonList: BottomNavScreen("pokemonList", "", Icons.Default.Home)
    data object Favorites: BottomNavScreen("favorites", "", Icons.Default.Star)
}