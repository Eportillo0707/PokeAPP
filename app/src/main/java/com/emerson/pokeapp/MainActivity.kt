package com.emerson.pokeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.emerson.pokeapp.ui.components.BottomNavScreen
import com.emerson.pokeapp.ui.components.BottomNavigationBar
import com.emerson.pokeapp.ui.screens.favoritesPokemon.FavoritesPokemonScreen
import com.emerson.pokeapp.ui.screens.pokemonInfo.PokemonInfoScreen
import com.emerson.pokeapp.ui.screens.pokemonInfo.PokemonInfoViewModel
import com.emerson.pokeapp.ui.screens.pokemonList.PokemonListScreen
import com.emerson.pokeapp.ui.screens.searchPokemon.SearchPokemonScreen
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val navController = rememberNavController()
            Scaffold(
                bottomBar = {
                    BottomNavigationBar(navController = navController)
                }
            ) { paddingValues ->
                NavHost(
                    navController = navController,

                    startDestination = BottomNavScreen.PokemonList.route,
                                        Modifier.padding(paddingValues)

                ) {
                    composable(
                        route = BottomNavScreen.PokemonList.route,
                        enterTransition = { fadeIn(animationSpec = tween(300))},
                        popEnterTransition = { fadeIn( animationSpec = tween(300)) },

                    ) {
                        PokemonListScreen(
                            navController = navController,
                            viewModel = koinViewModel()
                        )
                    }
                    composable(
                        route = BottomNavScreen.Favorites.route,
                        enterTransition = { fadeIn( animationSpec = tween(300))},
                        popEnterTransition = { fadeIn( animationSpec = tween(300)) },

                    ){
                        FavoritesPokemonScreen(
                            viewModel = koinViewModel(),
                            navController = navController
                        )
                    }


                    composable(
                        route = "pokemonInfo/{pokemonName}",
                        enterTransition = { fadeIn(animationSpec = tween(300))},
                        popEnterTransition = { fadeIn( animationSpec = tween(300)) },

                        arguments = listOf(navArgument("pokemonName") {
                            type = NavType.StringType
                        }),
                    ) { backStackEntry ->
                        val pokemonName = backStackEntry.arguments?.getString("pokemonName")
                            ?: return@composable
                        val viewModel = koinViewModel<PokemonInfoViewModel> {
                            parametersOf(pokemonName)
                        }
                        PokemonInfoScreen(
                            viewModel = viewModel,
                            navController = navController
                        )
                    }
                    composable(
                        route = "searchPokemon",
                        enterTransition = { fadeIn(animationSpec = tween(300))},
                        popEnterTransition = { fadeIn(animationSpec = tween(300)) },

                        ) {
                        SearchPokemonScreen(
                            navController = navController,
                            viewModel = koinViewModel()
                        )


                    }

                }


            }


        }
    }

}






