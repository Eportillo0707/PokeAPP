package com.emerson.pokeapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.emerson.pokeapp.ui.theme.montserratFamily

@Composable
fun BottomNavigationBar(
    navController: NavController
) {
    val items = listOf(
        BottomNavScreen.PokemonList,
        BottomNavScreen.Favorites

    )
    NavigationBar(
        containerColor = Color(0xFF232B4C),
        modifier = Modifier.height(50.dp)
    ) {
        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route
        items.forEach { screen ->
            NavigationBarItem(
                icon = { },
                label = {
                        Text(
                            screen.title,
                            fontFamily = montserratFamily,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = if (currentRoute == screen.route) Color.White else Color.Gray
                        )
                },

                selected = currentRoute == screen.route,

                onClick = {
                    if (currentRoute != screen.route) {
                        navController.navigate(screen.route) {

                            launchSingleTop = true
                            restoreState = true

                        }
                    }
                },
                modifier = Modifier
                    .padding(top = 23.dp)
                    .size(25.dp),
            )

        }
    }
}