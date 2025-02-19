package com.emerson.pokeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.emerson.pokeapp.ui.screens.pokemonInfo.PokemonInfoScreen
import com.emerson.pokeapp.ui.screens.pokemonInfo.PokemonInfoViewModel
import com.emerson.pokeapp.ui.screens.pokemonList.PokemonListScreen
import com.emerson.pokeapp.ui.screens.searchPokemon.SearchPokemonScreen
import com.emerson.pokeapp.ui.theme.PokeAppTheme
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PokeAppTheme {
                val navController = rememberNavController()
                Surface {
                    NavHost(navController = navController, startDestination = "pokemonList") {
                        composable("pokemonList") {
                            PokemonListScreen(
                                navController = navController,
                                viewModel = koinViewModel()
                            )
                        }
                        composable("searchPokemon") {
                            SearchPokemonScreen(
                                navController = navController,
                                viewModel = koinViewModel()
                            )


                        }
                        composable("pokemonInfo/{pokemonName}") { backStackEntry ->
                            val pokemonName = backStackEntry.arguments?.getString("pokemonName")
                            if (pokemonName != null) {
                                val viewModel: PokemonInfoViewModel = koinViewModel(
                                    parameters = { parametersOf(pokemonName) }
                                )
                                PokemonInfoScreen(
                                    viewModel = viewModel,
                                    pokemonName = pokemonName,
                                    navController = navController

                                )
                            }


                        }


                    }

                }
            }

        }
    }
}




