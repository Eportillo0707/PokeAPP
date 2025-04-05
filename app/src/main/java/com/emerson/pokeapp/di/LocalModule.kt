package com.emerson.pokeapp.di

import android.content.Context
import androidx.room.Room
import com.emerson.pokeapp.data.local.PokemonDataBase
import com.emerson.pokeapp.data.local.converters.StringListConverter
import org.koin.dsl.module

internal fun createPokemonDataBase(context: Context) =
Room.databaseBuilder(context,PokemonDataBase::class.java, "pokemon_db")
    .addTypeConverter(StringListConverter())
    .build()
    .pokemonDao


