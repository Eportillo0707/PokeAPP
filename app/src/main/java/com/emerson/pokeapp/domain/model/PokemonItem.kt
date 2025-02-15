package com.emerson.pokeapp.domain.model

import com.emerson.pokeapp.BuildConfig

data class PokemonItem(
    val id: Int,
    val name: String,
    val pokemonTypes: List<String>
) {
    val ImageUrl: String
        get() = String.format(BuildConfig.POKEMON_IMAGE_URL, name.lowercase())
}