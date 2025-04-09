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

val PokemonTypes = listOf(
    "fire" to R.drawable.fire,
    "water" to R.drawable.water,
    "grass" to R.drawable.grass,
    "electric" to R.drawable.electric,
    "psychic" to R.drawable.psychic,
    "ice" to R.drawable.ice,
    "dragon" to R.drawable.dragon,
    "dark" to R.drawable.dark,
    "fairy" to R.drawable.fairy,
    "fighting" to R.drawable.fighting,
    "poison" to R.drawable.poison,
    "ground" to R.drawable.ground,
    "flying" to R.drawable.flying,
    "normal" to R.drawable.normal,
    "bug" to R.drawable.bug,
    "rock" to R.drawable.rock,
    "ghost" to R.drawable.ghost,
    "steel" to R.drawable.steel
)