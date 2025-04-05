package com.emerson.pokeapp.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.emerson.pokeapp.domain.model.PokemonItem

@Entity(tableName = "favorite_pokemon")
internal class FavoriteEntity (
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "pokemon_types")
    val pokemonTypes: List<String>

){
    constructor(pokemonItem: PokemonItem) : this(
        id = pokemonItem.id,
        name = pokemonItem.name,
        pokemonTypes = pokemonItem.pokemonTypes

    )

}