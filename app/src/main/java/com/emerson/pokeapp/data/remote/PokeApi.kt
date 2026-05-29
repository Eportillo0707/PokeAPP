package com.emerson.pokeapp.data.remote

import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import kotlinx.coroutines.flow.Flow


interface PokeApi {
    suspend fun getPokemonList(limit: Int, offset: Int, query: String?): Flow<PagingData<PokemonItem>>
    suspend fun getPokemonInfo(pokemonName: String): PokemonInfo

}

