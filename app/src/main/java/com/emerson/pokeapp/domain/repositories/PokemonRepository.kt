package com.emerson.pokeapp.domain.repositories

import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

    suspend fun getPokemonList(offset: Int, query: String): Flow<PagingData<PokemonItem>>

    suspend fun getPokemonInfo(pokemonName: String): PokemonInfo

    fun getFavoritePokemon(): Flow<List<PokemonItem>>

    suspend fun insertFavorite(pokemonItem: PokemonItem)

    suspend fun deleteFavorite(pokemonItem: PokemonItem)

    suspend fun getPokemonByType(type: String): List<PokemonItem>


}