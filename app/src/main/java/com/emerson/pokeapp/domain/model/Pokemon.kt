package com.emerson.pokeapp.domain.model

import com.emerson.pokeapp.data.remote.responses.Ability
import com.emerson.pokeapp.data.remote.responses.Cries
import com.emerson.pokeapp.data.remote.responses.Form
import com.emerson.pokeapp.data.remote.responses.GameIndice
import com.emerson.pokeapp.data.remote.responses.HeldItem
import com.emerson.pokeapp.data.remote.responses.Move
import com.emerson.pokeapp.data.remote.responses.Species
import com.emerson.pokeapp.data.remote.responses.Sprites
import com.emerson.pokeapp.data.remote.responses.Stat
import com.emerson.pokeapp.data.remote.responses.Type

data class Pokemon(
    val abilities: List<Ability>,
    val baseExperience: Int,
    val cries: Cries,
    val forms: List<Form>,
    val gameIndices: List<GameIndice>,
    val height: Int,
    val heldItems: List<HeldItem>,
    val id: Int,
    val isDefault: Boolean,
    val locationAreaEncounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Int,
    val pastAbilities: List<Any?>,
    val pastTypes: List<Any?>,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Int
)