package com.emerson.pokeapp.domain.usecases

import androidx.paging.PagingData
import com.emerson.pokeapp.data.remote.responses.PokemonListResponse
import com.emerson.pokeapp.domain.model.Pokemon
import com.emerson.pokeapp.repository.PokemonRepository
import kotlinx.coroutines.flow.Flow

class GetPokemonListUseCase(private val repository: PokemonRepository)  {
    operator fun invoke(): Flow<PagingData<Pokemon>> = repository.getPokemonList()
}