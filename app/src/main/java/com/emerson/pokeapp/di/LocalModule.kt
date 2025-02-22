package com.emerson.pokeapp.di

import android.content.Context
import androidx.room.Room
import com.emerson.pokeapp.data.local.PokemonDataBase
import org.koin.dsl.module

internal fun createPokemonDataBase(context: Context) =
Room.databaseBuilder(context,PokemonDataBase::class.java, "pokemon_db")
    .build()
    .pokemonDao


