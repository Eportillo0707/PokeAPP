package com.emerson.pokeapp.data.remote.dto

import com.google.gson.annotations.SerializedName

data class PokemonListResponseDto(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<NamedApiResourceDto>
)

data class NamedApiResourceDto(
    val name: String,
    val url: String
)

data class PokemonDetailDto(
    val id: Int,
    val name: String,
    val height: Int?,
    val weight: Int?,

    @SerializedName("base_experience")
    val baseExperience: Int?,

    val types: List<PokemonTypeSlotDto>,
    val stats: List<PokemonStatSlotDto> = emptyList(),
    val abilities: List<PokemonAbilitySlotDto> = emptyList(),
    val species: NamedApiResourceDto? = null
)

data class PokemonTypeSlotDto(
    val slot: Int,
    val type: NamedApiResourceDto
)

data class PokemonStatSlotDto(
    @SerializedName("base_stat")
    val baseStat: Int,
    val stat: NamedApiResourceDto
)

data class PokemonAbilitySlotDto(
    val ability: NamedApiResourceDto,

    @SerializedName("is_hidden")
    val isHidden: Boolean? = null,

    val slot: Int? = null
)

data class AbilityDto(
    val id: Int,
    val name: String,

    @SerializedName("flavor_text_entries")
    val flavorTextEntries: List<FlavorTextEntryDto> = emptyList()
)

data class PokemonSpeciesDto(
    val id: Int,
    val name: String,

    @SerializedName("flavor_text_entries")
    val flavorTextEntries: List<FlavorTextEntryDto> = emptyList(),

    @SerializedName("evolution_chain")
    val evolutionChain: NamedApiResourceDto? = null,

    @SerializedName("varieties")
    val varieties: List<PokemonVarietyDto> = emptyList()
)

data class PokemonVarietyDto(
    @SerializedName("is_default")
    val isDefault: Boolean = false,

    val pokemon: NamedApiResourceDto
)

data class FlavorTextEntryDto(
    @SerializedName("flavor_text")
    val flavorText: String,
    val language: NamedApiResourceDto
)

data class EvolutionChainDto(
    val id: Int,
    val chain: EvolutionChainLinkDto
)

data class EvolutionChainLinkDto(
    val species: NamedApiResourceDto,

    @SerializedName("evolution_details")
    val evolutionDetails: List<EvolutionDetailDto> = emptyList(),

    @SerializedName("evolves_to")
    val evolvesTo: List<EvolutionChainLinkDto> = emptyList()
)

data class EvolutionDetailDto(
    @SerializedName("min_level")
    val minLevel: Int? = null,

    val trigger: NamedApiResourceDto? = null,

    val item: NamedApiResourceDto? = null,

    @SerializedName("held_item")
    val heldItem: NamedApiResourceDto? = null,

    @SerializedName("known_move")
    val knownMove: NamedApiResourceDto? = null,

    @SerializedName("known_move_type")
    val knownMoveType: NamedApiResourceDto? = null,

    val location: NamedApiResourceDto? = null,

    @SerializedName("min_happiness")
    val minHappiness: Int? = null,

    @SerializedName("min_beauty")
    val minBeauty: Int? = null,

    @SerializedName("min_affection")
    val minAffection: Int? = null,

    @SerializedName("time_of_day")
    val timeOfDay: String? = null,

    @SerializedName("needs_overworld_rain")
    val needsOverworldRain: Boolean? = null,

    @SerializedName("turn_upside_down")
    val turnUpsideDown: Boolean? = null
)
data class TypeDto(
    val id: Int,
    val name: String,
    val pokemon: List<TypePokemonSlotDto> = emptyList()
)

data class TypePokemonSlotDto(
    val pokemon: NamedApiResourceDto,
    val slot: Int
)