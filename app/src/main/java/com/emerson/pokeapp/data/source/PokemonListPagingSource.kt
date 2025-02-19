package com.emerson.pokeapp.data.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.api.Optional
import com.emerson.pokeapp.data.remote.GetPokemonListQuery
import com.emerson.pokeapp.data.remote.mappers.PokemonMapper
import com.emerson.pokeapp.domain.model.PokemonItem


class PokemonListPagingSource(
    private val apolloClient: ApolloClient,
    private val pokemonMapper: PokemonMapper,
    private val query: String? = null
) : PagingSource<Int, PokemonItem>() {
    override fun getRefreshKey(state: PagingState<Int, PokemonItem>): Int = 0

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PokemonItem> {
        val offset = params.key ?: 0
        val limit = 60

        val optionalQuery = if (query.isNullOrEmpty()){
            Optional.Absent
        }else{
            Optional.Present("%$query%")
        }


        return try {
            val response =
                apolloClient.query(GetPokemonListQuery(limit, offset, query = optionalQuery))
                    .execute()


            val list = response.data?.pokemon_v2_pokemon?.mapNotNull {
                pokemonMapper.mapToDomain(it)
            } ?: emptyList()

            LoadResult.Page(
                data = list,
                prevKey = if (offset == 0) null else offset - limit,
                nextKey = if (list.isEmpty()) null else offset + limit,


                )

        } catch (ex: Exception) {
            LoadResult.Error(ex)

        }
    }
}