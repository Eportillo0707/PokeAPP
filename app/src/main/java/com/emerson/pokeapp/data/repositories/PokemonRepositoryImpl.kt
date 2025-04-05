package com.emerson.pokeapp.data.repositories

import androidx.paging.PagingData
import com.emerson.pokeapp.data.local.PokemonDao
import com.emerson.pokeapp.data.local.model.FavoriteEntity
import com.emerson.pokeapp.data.source.PokemonRemoteDataSource
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.repositories.PokemonRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

internal class PokemonRepositoryImpl(

    private val remoteDataSource: PokemonRemoteDataSource,
    private val pokemonDao: PokemonDao
) : PokemonRepository {
    override suspend fun getPokemonList(offset: Int, query: String): Flow<PagingData<PokemonItem>> {
        return remoteDataSource.getPokemonList(limit = 20, offset, query)
    }

    override suspend fun getPokemonInfo(pokemonName: String): PokemonInfo {
        return remoteDataSource.getPokemonInfo(pokemonName)
    }

    override fun getFavoritePokemon(): Flow<List<PokemonItem>> = pokemonDao.getAllFavorites()
        .map { items -> items.map { PokemonItem(it.id, it.name, it.pokemonTypes) } }

    override suspend fun insertFavorite(pokemonItem: PokemonItem) =

        pokemonDao.insertFavorite(FavoriteEntity(pokemonItem))


    override suspend fun deleteFavorite(pokemonItem: PokemonItem) {
        pokemonDao.deleteFavorite(FavoriteEntity(pokemonItem))
    }
}






