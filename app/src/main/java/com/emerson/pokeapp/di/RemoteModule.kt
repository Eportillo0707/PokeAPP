package com.emerson.pokeapp.di

import com.emerson.pokeapp.data.remote.ApolloPokemonClient
import org.koin.dsl.module

val remoteModule = module {
    single { ApolloPokemonClient().getApolloClient()}
}