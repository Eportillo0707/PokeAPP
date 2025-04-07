package com.emerson.pokeapp.domain.model

import androidx.compose.ui.graphics.Color

data class PokemonInfo(
    val id: Int,
    val name: String,
    val height: Int,
    val weight: Int,
    val baseExperience: Int,
    val stats: List<PokemonStat>,
    val types: List<String>,
    val evolutionChain: List<List<PokemonSpecies>>,
    val abilities: List<PokemonAbility>,
    val description: String,
    var isFavored: Boolean = false
)
data class PokemonAbility(
    val name: String,
    val flavorText: String
)

data class PokemonSpecies(
    val id: Int,
    val name: String,
    val evolvesFromSpeciesId: Int?
)

data class PokemonStat(
    val name: String?,
    val baseStat: Int,
    val maxStatValue: Int = 255
    )

fun getPokemonTypeColor(type: String?): Color {
    return when (type) {
        "normal" -> Color(0xFF9FA19E)
        "fire" -> Color(0xFFE62828)
        "water" -> Color(0xFF2981EF)
        "electric" -> Color(0xFFFABF00)
        "grass" -> Color(0xFF3FA12A)
        "ice" -> Color(0xFF96D9D6)
        "fighting" -> Color(0xFFFF8000)
        "poison" -> Color(0xFFA33EA1)
        "ground" -> Color(0xFF915121)
        "flying" -> Color(0xFF689DFE)
        "psychic" -> Color(0xFFEE4179)
        "bug" -> Color(0xFF91A11A)
        "rock" -> Color(0xFFAFA981)
        "ghost" -> Color(0xFF704170)
        "dragon" -> Color(0xFF5160E1)
        "dark" -> Color(0xFF50413F)
        "steel" -> Color(0xFF60A1B8)
        "fairy" -> Color(0xFFD685AD)
        else -> Color.Gray
    }
}
