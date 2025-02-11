package com.emerson.pokeapp.repository

import androidx.paging.PagingData
import com.emerson.pokeapp.data.remote.responses.PokemonDto
import com.emerson.pokeapp.data.remote.responses.PokemonListResponse
import com.emerson.pokeapp.data.remote.responses.PokemonResult
import com.emerson.pokeapp.domain.model.Pokemon
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {

        fun getPokemonList(limit: Int, offset: Int): Flow<PagingData<PokemonResult>>
        fun getPokemonInfo(id: Int): Pokemon
}