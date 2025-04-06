package com.emerson.pokeapp.domain.model

data class TypeEffectiveness(
    val weakTo: List<String> = emptyList(),
    val resistantTo: List<String> = emptyList(),
    val immuneTo: List<String> = emptyList()

)
 val defenseMultipliers: Map<String, Map<String, Double>> = mapOf(
    "fire" to mapOf(
        "water" to 2.0,
        "rock" to 2.0,
        "ground" to 2.0,
        "fire" to 0.5,
        "bug" to 0.5,
        "grass" to 0.5,
        "ice" to 0.5,
        "steel" to 0.5,
        "fairy" to 0.5
    ),
    "water" to mapOf(
        "electric" to 2.0,
        "grass" to 2.0,
        "fire" to 0.5,
        "water" to 0.5,
        "steel" to 0.5,
        "ice" to 0.5
    ),
    "grass" to mapOf(
        "fire" to 2.0,
        "ice" to 2.0,
        "bug" to 2.0,
        "flying" to 2.0,
        "poison" to 2.0,
        "grass" to 0.5,
        "electric" to 0.5,
        "ground" to 0.5,
        "water" to 0.5
    ),
    "normal" to mapOf(
        "fighting" to 2.0,
        "ghost" to 0.0
    ),
    "fighting" to mapOf(
        "flying" to 2.0,
        "psychic" to 2.0,
        "fairy" to 2.0,
        "rock" to 0.5,
        "bug" to 0.5,
        "dark" to 0.5
    ),
    "flying" to mapOf(
        "electric" to 2.0,
        "ice" to 2.0,
        "rock" to 2.0,
        "fighting" to 0.5,
        "grass" to 0.5,
        "bug" to 0.5,
        "ground" to 0.0
    ),
    "poison" to mapOf(
        "ground" to 2.0,
        "psychic" to 2.0,
        "fairy" to 0.5,
        "fighting" to 0.5,
        "poison" to 0.5,
        "grass" to 0.5,
        "bug" to 0.5
    ),
    "ground" to mapOf(
        "water" to 2.0,
        "grass" to 2.0,
        "ice" to 2.0,
        "poison" to 0.5,
        "rock" to 0.5,
        "electric" to 0.0
    ),
    "rock" to mapOf(
        "fighting" to 2.0,
        "ground" to 2.0,
        "steel" to 2.0,
        "water" to 2.0,
        "grass" to 2.0,
        "normal" to 0.5,
        "flying" to 0.5,
        "poison" to 0.5,
        "fire" to 0.5
    ),
    "bug" to mapOf(
        "flying" to 2.0,
        "rock" to 2.0,
        "fire" to 2.0,
        "fighting" to 0.5,
        "grass" to 0.5,
        "ground" to 0.5
    ),
    "ghost" to mapOf(
        "ghost" to 2.0,
        "dark" to 2.0,
        "poison" to 0.5,
        "bug" to 0.5,
        "normal" to 0.0,
        "fighting" to 0.0
    ),
    "steel" to mapOf(
        "fire" to 2.0,
        "ground" to 2.0,
        "fighting" to 2.0,
        "normal" to 0.5,
        "rock" to 0.5,
        "flying" to 0.5,
        "bug" to 0.5,
        "grass" to 0.5,
        "steel" to 0.5,
        "psychic" to 0.5,
        "ice" to 0.5,
        "dragon" to 0.5,
        "fairy" to 0.5,
        "poison" to 0.0
    ),
    "electric" to mapOf(
        "ground" to 2.0,
        "flying" to 0.5,
        "steel" to 0.5,
        "electric" to 0.5
    ),
    "psychic" to mapOf(
        "bug" to 2.0,
        "ghost" to 2.0,
        "dark" to 2.0,
        "fighting" to 0.5,
        "psychic" to 0.5
    ),
    "ice" to mapOf(
        "fighting" to 2.0,
        "rock" to 2.0,
        "steel" to 2.0,
        "fire" to 2.0,
        "ice" to 0.5,
    ),
    "dragon" to mapOf(
        "dragon" to 2.0,
        "fairy" to 2.0,
        "ice" to 2.0,
        "fire" to 0.5,
        "water" to 0.5,
        "electric" to 0.5,
        "grass" to 0.5
    ),
    "dark" to mapOf(
        "fighting" to 2.0,
        "bug" to 2.0,
        "fairy" to 2.0,
        "ghost" to 0.5,
        "dark" to 0.5,
        "psychic" to 0.0
    ),
    "fairy" to mapOf(
        "poison" to 2.0,
        "steel" to 2.0,
        "fighting" to 0.5,
        "bug" to 0.5,
        "dark" to 0.5,
        "dragon" to 0.0
    )
)