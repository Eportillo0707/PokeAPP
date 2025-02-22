package com.emerson.pokeapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.emerson.pokeapp.data.local.model.FavoriteEntity

@Database(entities = [FavoriteEntity::class], version = 1)
internal abstract class PokemonDataBase : RoomDatabase() {
    abstract val pokemonDao: PokemonDao
}