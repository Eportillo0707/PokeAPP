package com.emerson.pokeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
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
import com.emerson.pokeapp.ui.screens.pokemonList.PokemonListByTypeScreen
import com.emerson.pokeapp.ui.screens.pokemonList.PokemonListScreen
import com.emerson.pokeapp.ui.screens.searchPokemon.SearchPokemonScreen
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalSharedTransitionApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var keepSplash = true
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition { keepSplash }

        lifecycleScope.launch {
            delay(1000)
            keepSplash = false
        }

        setContent {
            SharedTransitionLayout {
                val navController = rememberNavController()
                val systemUiController = rememberSystemUiController()
                val statusBarColor = Color(0xFF121422)

                SideEffect {
                    systemUiController.setStatusBarColor(
                        color = statusBarColor,
                        darkIcons = false
                    )
                }

                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(navController = navController)
                    }
                ) { paddingValues ->
                    NavHost(
                        navController = navController,
                        startDestination = BottomNavScreen.PokemonList.route,
                        modifier = Modifier.padding(paddingValues)
                    ) {
                        composable(
                            route = BottomNavScreen.PokemonList.route,
                            enterTransition = {
                                fadeIn(animationSpec = tween(300))
                            },
                            popEnterTransition = {
                                fadeIn(animationSpec = tween(300))
                            }
                        ) {
                            PokemonListScreen(
                                navController = navController,
                                viewModel = koinViewModel(),
                                sharedTransitionScope = this@SharedTransitionLayout,
                                animatedVisibilityScope = this
                            )
                        }

                        composable(
                            route = BottomNavScreen.Favorites.route,
                            enterTransition = {
                                fadeIn(animationSpec = tween(300))
                            },
                            popEnterTransition = {
                                fadeIn(animationSpec = tween(300))
                            }
                        ) {
                            FavoritesPokemonScreen(
                                navController = navController,
                                viewModel = koinViewModel(),
                                sharedTransitionScope = this@SharedTransitionLayout,
                                animatedVisibilityScope = this
                            )
                        }

                        composable(
                            route = "pokemonInfo/{pokemonName}?pokemonId={pokemonId}",
                            enterTransition = {
                                fadeIn(animationSpec = tween(300))
                            },
                            popEnterTransition = {
                                fadeIn(animationSpec = tween(300))
                            },
                            arguments = listOf(
                                navArgument("pokemonName") {
                                    type = NavType.StringType
                                },
                                navArgument("pokemonId") {
                                    type = NavType.IntType
                                    defaultValue = -1
                                }
                            )
                        ) { backStackEntry ->
                            val pokemonName =
                                backStackEntry.arguments?.getString("pokemonName") ?: return@composable

                            val pokemonId =
                                backStackEntry.arguments?.getInt("pokemonId") ?: -1

                            val viewModel = koinViewModel<PokemonInfoViewModel> {
                                parametersOf(pokemonName)
                            }

                            PokemonInfoScreen(
                                navController = navController,
                                viewModel = viewModel,
                                initialPokemonName = pokemonName,
                                initialPokemonId = pokemonId.takeIf { it > 0 },
                                sharedTransitionScope = this@SharedTransitionLayout,
                                animatedVisibilityScope = this
                            )
                        }

                        composable(
                            route = "searchPokemon",
                            enterTransition = {
                                fadeIn(animationSpec = tween(300))
                            },
                            popEnterTransition = {
                                fadeIn(animationSpec = tween(300))
                            }
                        ) {
                            SearchPokemonScreen(
                                navController = navController,
                                viewModel = koinViewModel(),
                                sharedTransitionScope = this@SharedTransitionLayout,
                                animatedVisibilityScope = this
                            )
                        }

                        composable(
                            route = "pokemonListByType/{pokemonType}",
                            enterTransition = {
                                fadeIn(animationSpec = tween(300))
                            },
                            popEnterTransition = {
                                fadeIn(animationSpec = tween(300))
                            }
                        ) {
                            val pokemonType = it.arguments?.getString("pokemonType") ?: ""
                            PokemonListByTypeScreen(
                                navController = navController,
                                viewModel = koinViewModel {
                                    parametersOf(pokemonType)
                                },
                                sharedTransitionScope = this@SharedTransitionLayout,
                                animatedVisibilityScope = this
                            )
                        }
                    }
                }
            }
        }
    }
}