package com.emerson.pokeapp.data.repositories

import androidx.paging.PagingData
import com.apollographql.apollo3.ApolloClient
import com.emerson.pokeapp.data.source.PokemonRemoteDataSource
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow

internal class PokemonRepositoryImpl(

    private val remoteDataSource: PokemonRemoteDataSource,
) : PokemonRepository {
    override suspend fun getPokemonList(offset: Int, query: String): Flow<PagingData<PokemonItem>> {
        return remoteDataSource.getPokemonList(limit = 20, offset, query)
    }

    override suspend fun getPokemonInfo(pokemonName: String): PokemonInfo {
        return remoteDataSource.getPokemonInfo(pokemonName)
    }




}






