package com.emerson.pokeapp.domain.repositories

import androidx.paging.PagingData
import com.emerson.pokeapp.domain.model.PokemonItem
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

        suspend fun getPokemonList(offset: Int, query: String? = null): Flow<PagingData<PokemonItem>>





}