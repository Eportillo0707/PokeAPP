package com.emerson.pokeapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.emerson.pokeapp.data.local.converters.StringListConverter
import com.emerson.pokeapp.data.local.model.FavoriteEntity

@Database(entities = [FavoriteEntity::class], version = 3)
@TypeConverters(StringListConverter::class)
internal abstract class PokemonDataBase : RoomDatabase() {
    abstract val pokemonDao: PokemonDao
}