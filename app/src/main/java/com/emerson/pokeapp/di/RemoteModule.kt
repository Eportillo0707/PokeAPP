package com.emerson.pokeapp.di

import com.emerson.pokeapp.data.remote.RetrofitPokemonClient
import org.koin.dsl.module

val remoteModule = module {
    single { RetrofitPokemonClient.create() }
}
