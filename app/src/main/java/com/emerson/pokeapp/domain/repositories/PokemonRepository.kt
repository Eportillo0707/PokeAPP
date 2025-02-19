package com.emerson.pokeapp.domain.repositories

import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.PokemonSpecies
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

        suspend fun getPokemonList(offset: Int, query: String): Flow<PagingData<PokemonItem>>
        suspend fun getPokemonInfo(pokemonName: String): PokemonInfo
        suspend fun getPokemonEvolution(pokemonName: String): List<List<PokemonSpecies>>





}