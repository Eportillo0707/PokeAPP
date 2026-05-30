package com.emerson.pokeapp.ui.navigation

object AppRoutes {
    const val SearchPokemon = "searchPokemon"
    const val PokemonListByType = "pokemonListByType/{pokemonType}"
    const val PokemonInfo = "pokemonInfo/{pokemonName}?pokemonId={pokemonId}"

    fun pokemonInfo(name: String, id: Int): String = "pokemonInfo/$name?pokemonId=$id"

    fun pokemonListByType(type: String): String = "pokemonListByType/$type"
}
