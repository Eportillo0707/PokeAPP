package com.emerson.pokeapp.di

import android.content.Context
import com.emerson.pokeapp.data.remote.ApolloPokemonClient
import com.emerson.pokeapp.data.remote.mappers.PokemonMapper
import com.emerson.pokeapp.data.repositories.PokemonRepositoryImpl
import com.emerson.pokeapp.data.source.PokemonRemoteDataSource
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { ApolloPokemonClient().getApolloClient() }
    single { PokemonMapper() }
    single { PokemonRemoteDataSource(get(), get()) }
    single<PokemonRepository> {
        PokemonRepositoryImpl(
            get(),
            pokemonDao = createPokemonDataBase(context = get<Context>())
        )
    }
}
