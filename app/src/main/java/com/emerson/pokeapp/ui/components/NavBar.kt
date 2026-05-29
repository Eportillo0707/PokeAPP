package com.emerson.pokeapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.width
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
        modifier = Modifier
            .height(60.dp)
            .navigationBarsPadding()
    ) {
        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

        items.forEach { screen ->
            val selected = currentRoute == screen.route

            NavigationBarItem(
                selected = selected,
                onClick = {
                    if (currentRoute != screen.route) {
                        navController.navigate(screen.route) {
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                icon = {
                    BottomBarContent(
                        title = screen.title,
                        selected = selected
                    )
                },
                label = null,
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.Transparent,
                    selectedIconColor = Color.White,
                    unselectedIconColor = Color.Gray
                )
            )
        }
    }
}

@Composable
private fun BottomBarContent(
    title: String,
    selected: Boolean
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontFamily = montserratFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = if (selected) Color.White else Color.Gray
        )

        Spacer(modifier = Modifier.height(6.dp))

        Box(
            modifier = Modifier
                .width(35.dp)
                .height(7.dp)
                .background(
                    color = if (selected) Color(0xFFE8D8FF) else Color.Transparent,
                    shape = RoundedCornerShape(50.dp)
                )
        )
    }
}