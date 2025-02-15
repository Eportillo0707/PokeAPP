package com.emerson.pokeapp.data.source

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.apollographql.apollo3.ApolloClient

import com.emerson.pokeapp.data.remote.PokeApi

import com.emerson.pokeapp.data.remote.mappers.PokemonMapper
import com.emerson.pokeapp.domain.model.PokemonItem
import kotlinx.coroutines.flow.Flow

class PokemonRemoteDataSource(
    private val apolloClient: ApolloClient,
    private val pokemonMapper: PokemonMapper
) : PokeApi {
    override suspend fun getPokemonList(
        limit: Int,
        offset: Int,
        query: String?
    ): Flow<PagingData<PokemonItem>> {
        return Pager(
            config = PagingConfig(pageSize = limit, prefetchDistance = 2),
            pagingSourceFactory = { PokemonListPagingSource(apolloClient, pokemonMapper, query) }
        ).flow
    }


}