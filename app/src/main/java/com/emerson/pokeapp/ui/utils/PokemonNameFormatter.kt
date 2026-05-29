package com.emerson.pokeapp.ui.utils

fun formatPokemonName(name: String): String {
    val parts = name
        .lowercase()
        .split("-")
        .filter { it.isNotBlank() }

    if (parts.isEmpty()) return name

    val baseName = parts.first().replaceFirstChar { it.uppercase() }

    return if (parts.contains("mega")) {
        val megaIndex = parts.indexOf("mega")

        val suffix = parts
            .drop(megaIndex + 1)
            .joinToString(" ") { part ->
                part.replaceFirstChar { it.uppercase() }
            }

        if (suffix.isBlank()) {
            "Mega $baseName"
        } else {
            "Mega $baseName $suffix"
        }
    } else {
        parts.joinToString(" ") { part ->
            part.replaceFirstChar { it.uppercase() }
        }
    }
}