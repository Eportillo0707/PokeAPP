package com.emerson.pokeapp.ui.components

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.emerson.pokeapp.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController,
    context: Context
) {
    val sharedPrefs = context.getSharedPreferences("app_preferences", Context.MODE_PRIVATE)
    val isFirstRun = sharedPrefs.getBoolean("isFirstRun", true)

    LaunchedEffect(key1 = isFirstRun) {
        delay(2000)
        if (isFirstRun) {
            sharedPrefs.edit().putBoolean("isFirstRun", false).apply()
            navController.navigate("pokemonListScreen") {
                popUpTo("splashScreen") { inclusive = true }
            }
        } else {
            navController.navigate(BottomNavScreen.PokemonList.route)
        }
    }

    Box(

        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121422))
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launchericon),
            contentDescription = "App Icon",
            modifier = Modifier.size(120.dp)
        )

    }
}


