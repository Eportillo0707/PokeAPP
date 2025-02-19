package com.emerson.pokeapp.di

import com.emerson.pokeapp.domain.repositories.PokemonRepository
import com.emerson.pokeapp.domain.usecases.GetPokemonInfoUseCase
import com.emerson.pokeapp.domain.usecases.GetPokemonListUseCase
import com.emerson.pokeapp.domain.usecases.SearchPokemonUseCase
import com.emerson.pokeapp.ui.screens.pokemonInfo.PokemonInfoViewModel
import com.emerson.pokeapp.ui.screens.pokemonList.PokemonListViewModel
import com.emerson.pokeapp.ui.screens.searchPokemon.SearchPokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModels =
    module {
        viewModel { PokemonListViewModel(getPokemonListUseCase = get<GetPokemonListUseCase>()) }
        viewModel { SearchPokemonViewModel(searchPokemonUseCase = get<SearchPokemonUseCase>()) }
        viewModel { (pokemonName: String) ->
            PokemonInfoViewModel(
                getPokemonInfoUseCase = get<GetPokemonInfoUseCase>(),
                pokemonName = pokemonName,

            )
        }

    }

val usecases = module {
    factory { GetPokemonListUseCase(repository = get<PokemonRepository>()) }
    factory { SearchPokemonUseCase(repository = get<PokemonRepository>()) }
    factory { GetPokemonInfoUseCase(pokemonRepository = get<PokemonRepository>()) }

}