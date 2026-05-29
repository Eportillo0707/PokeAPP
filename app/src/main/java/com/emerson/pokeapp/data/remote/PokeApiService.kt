package com.emerson.pokeapp.data.remote

import com.emerson.pokeapp.data.remote.dto.AbilityDto
import com.emerson.pokeapp.data.remote.dto.EvolutionChainDto
import com.emerson.pokeapp.data.remote.dto.PokemonDetailDto
import com.emerson.pokeapp.data.remote.dto.PokemonListResponseDto
import com.emerson.pokeapp.data.remote.dto.PokemonSpeciesDto
import com.emerson.pokeapp.data.remote.dto.TypeDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApiService {
    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonListResponseDto

    @GET("pokemon/{nameOrId}")
    suspend fun getPokemonDetail(
        @Path("nameOrId") nameOrId: String
    ): PokemonDetailDto

    @GET("pokemon-species/{nameOrId}")
    suspend fun getPokemonSpecies(
        @Path("nameOrId") nameOrId: String
    ): PokemonSpeciesDto

    @GET("ability/{nameOrId}")
    suspend fun getAbility(
        @Path("nameOrId") nameOrId: String
    ): AbilityDto

    @GET("evolution-chain/{id}")
    suspend fun getEvolutionChain(
        @Path("id") id: Int
    ): EvolutionChainDto

    @GET("type/{nameOrId}")
    suspend fun getPokemonByType(
        @Path("nameOrId") nameOrId: String
    ): TypeDto
}
