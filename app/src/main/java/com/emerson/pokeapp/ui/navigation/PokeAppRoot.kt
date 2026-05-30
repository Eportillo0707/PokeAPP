package com.emerson.pokeapp.ui.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
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
import org.koin.androidx.compose.koinViewModel
import org.koin.core.parameter.parametersOf

private const val SCREEN_FADE_DURATION = 300

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun PokeAppRoot() {
    SharedTransitionLayout {
        val navController = rememberNavController()
        ConfigureSystemBars()

        Scaffold(
            bottomBar = {
                BottomNavigationBar(navController = navController)
            }
        ) { paddingValues ->
            PokeNavHost(
                navController = navController,
                sharedTransitionScope = this@SharedTransitionLayout,
                modifier = Modifier.padding(paddingValues)
            )
        }
    }
}

@Composable
private fun ConfigureSystemBars() {
    val systemUiController = rememberSystemUiController()
    val statusBarColor = Color(0xFF121422)
    val navigationBarColor = Color(0xFF232B4C)
    SideEffect {
        systemUiController.setStatusBarColor(
            color = statusBarColor,
            darkIcons = false
        )
        systemUiController.setNavigationBarColor(
            color = navigationBarColor,
            darkIcons = false
        )
    }
}

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
private fun PokeNavHost(
    navController: NavHostController,
    sharedTransitionScope: SharedTransitionScope,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavScreen.PokemonList.route,
        modifier = modifier
    ) {
        composable(
            route = BottomNavScreen.PokemonList.route,
            enterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) },
            popEnterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) }
        ) {
            PokemonListScreen(
                navController = navController,
                viewModel = koinViewModel(),
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = this
            )
        }

        composable(
            route = BottomNavScreen.Favorites.route,
            enterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) },
            popEnterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) }
        ) {
            FavoritesPokemonScreen(
                navController = navController,
                viewModel = koinViewModel(),
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = this
            )
        }

        composable(
            route = AppRoutes.PokemonInfo,
            enterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) },
            popEnterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) },
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
            val pokemonName = backStackEntry.arguments?.getString("pokemonName") ?: return@composable
            val pokemonId = backStackEntry.arguments?.getInt("pokemonId") ?: -1
            val viewModel = koinViewModel<PokemonInfoViewModel> {
                parametersOf(pokemonName)
            }

            PokemonInfoScreen(
                navController = navController,
                viewModel = viewModel,
                initialPokemonName = pokemonName,
                initialPokemonId = pokemonId.takeIf { it > 0 },
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = this
            )
        }

        composable(
            route = AppRoutes.SearchPokemon,
            enterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) },
            popEnterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) }
        ) {
            SearchPokemonScreen(
                navController = navController,
                viewModel = koinViewModel(),
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = this
            )
        }

        composable(
            route = AppRoutes.PokemonListByType,
            enterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) },
            popEnterTransition = { fadeIn(animationSpec = tween(SCREEN_FADE_DURATION)) }
        ) {
            val pokemonType = it.arguments?.getString("pokemonType") ?: ""
            PokemonListByTypeScreen(
                navController = navController,
                viewModel = koinViewModel {
                    parametersOf(pokemonType)
                },
                sharedTransitionScope = sharedTransitionScope,
                animatedVisibilityScope = this
            )
        }
    }
}
