package com.emerson.pokeapp.domain.model

import com.emerson.pokeapp.BuildConfig
import com.emerson.pokeapp.R

data class PokemonItem(
    val id: Int,
    val name: String,
    val pokemonTypes: List<String>,
    var isFavored: Boolean = false
) {
    val ImageUrl: String
        get() = String.format(BuildConfig.POKEMON_IMAGE_URL, id)
}
val TypeIcons = mapOf(
    "grass" to R.drawable.grasssv,
    "poison" to R.drawable.poisonsv,
    "fire" to R.drawable.firesv,
    "water" to R.drawable.watersv,
    "bug" to R.drawable.bugsv,
    "normal" to R.drawable.normalsv,
    "electric" to R.drawable.electricsv,
    "ground" to R.drawable.groundsv,
    "fairy" to R.drawable.fairysv,
    "fighting" to R.drawable.fightingsv,
    "psychic" to R.drawable.psychicsv,
    "rock" to R.drawable.rocksv,
    "ghost" to R.drawable.ghostsv,
    "ice" to R.drawable.iceicsv,
    "dragon" to R.drawable.dragonsv,
    "dark" to R.drawable.darksv,
    "steel" to R.drawable.steelsv,
    "flying" to R.drawable.flyingsv
)