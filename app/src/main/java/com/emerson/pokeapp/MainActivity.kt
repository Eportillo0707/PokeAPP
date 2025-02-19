package com.emerson.pokeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.slideInHorizontally
import androidx.compose.material3.Surface
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
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
            Surface {
                NavHost(navController = navController, startDestination = "pokemonList") {
                    composable(
                        route = "pokemonList",

                    ) {
                        PokemonListScreen(
                            navController = navController,
                            viewModel = koinViewModel()
                        )
                    }
                    composable(
                        route = "searchPokemon",

                        ) {
                        SearchPokemonScreen(
                            navController = navController,
                            viewModel = koinViewModel()
                        )


                    }
                    composable(
                        route = "pokemonInfo/{pokemonName}",
                        arguments = listOf(navArgument("pokemonName"){
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
                                navController = navController,
                                pokemonName = pokemonName
                            )
                        }


                    }


                }

            }
        }

    }






