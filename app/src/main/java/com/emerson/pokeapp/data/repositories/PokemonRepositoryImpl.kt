package com.emerson.pokeapp.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.apollographql.apollo3.ApolloClient
import com.emerson.pokeapp.data.remote.PokeApi
import com.emerson.pokeapp.data.remote.mappers.PokemonMapper
import com.emerson.pokeapp.data.source.PokemonListPagingSource
import com.emerson.pokeapp.data.source.PokemonRemoteDataSource
import com.emerson.pokeapp.di.remoteModule
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow

internal class PokemonRepositoryImpl(

    private val remoteDataSource: PokemonRemoteDataSource
) : PokemonRepository {
    override suspend fun getPokemonList(offset: Int, query: String): Flow<PagingData<PokemonItem>> {
        return remoteDataSource.getPokemonList(limit = 20, offset, query)
    }



}



