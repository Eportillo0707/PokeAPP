package com.emerson.pokeapp.data.remote.mappers

import com.emerson.pokeapp.data.remote.dto.AbilityDto
import com.emerson.pokeapp.data.remote.dto.EvolutionChainDto
import com.emerson.pokeapp.data.remote.dto.EvolutionChainLinkDto
import com.emerson.pokeapp.data.remote.dto.EvolutionDetailDto
import com.emerson.pokeapp.data.remote.dto.PokemonDetailDto
import com.emerson.pokeapp.data.remote.dto.PokemonSpeciesDto
import com.emerson.pokeapp.domain.model.PokemonAbility
import com.emerson.pokeapp.domain.model.PokemonInfo
import com.emerson.pokeapp.domain.model.PokemonItem
import com.emerson.pokeapp.domain.model.PokemonSpecies
import com.emerson.pokeapp.domain.model.PokemonStat

class PokemonMapper {

    fun mapToItem(pokemon: PokemonDetailDto): PokemonItem {
        return PokemonItem(
            id = pokemon.id,
            name = pokemon.name,
            pokemonTypes = pokemon.types
                .sortedBy { it.slot }
                .map { it.type.name }
        )
    }

    fun mapToInfo(
        pokemon: PokemonDetailDto,
        species: PokemonSpeciesDto?,
        evolutionChain: EvolutionChainDto?,
        abilities: List<AbilityDto>,
        extraEvolutionForms: List<PokemonSpecies> = emptyList()
    ): PokemonInfo {
        val stats = pokemon.stats.map {
            PokemonStat(
                name = it.stat.name,
                baseStat = it.baseStat
            )
        }

        val types = pokemon.types
            .sortedBy { it.slot }
            .map { it.type.name }

        val description = species
            ?.flavorTextEntries
            ?.firstOrNull { it.language.name == "en" }
            ?.flavorText
            ?.cleanText()
            ?: ""

        val mappedAbilities = pokemon.abilities.mapNotNull { abilitySlot ->
            val ability = abilities.firstOrNull { it.name == abilitySlot.ability.name }
                ?: return@mapNotNull null

            val flavorText = ability.flavorTextEntries
                .firstOrNull { it.language.name == "en" }
                ?.flavorText
                ?.cleanText()
                ?: ""

            PokemonAbility(
                name = ability.name,
                flavorText = flavorText
            )
        }

        val normalEvolutionList = mapEvolutionSpecies(evolutionChain)

        val completeEvolutionList = (normalEvolutionList + extraEvolutionForms)
            .distinctBy { it.name }

        val evolutionList = if (completeEvolutionList.isNotEmpty()) {
            listOf(completeEvolutionList)
        } else {
            emptyList()
        }

        val megaEvolutionList = extraEvolutionForms
            .distinctBy { it.name }
            .sortedBy { it.id }

        return PokemonInfo(
            id = pokemon.id,
            name = pokemon.name,
            height = pokemon.height ?: 0,
            weight = pokemon.weight ?: 0,
            baseExperience = pokemon.baseExperience ?: 0,
            stats = stats,
            types = types,
            evolutionChain = evolutionList,
            megaEvolutions = megaEvolutionList,
            abilities = mappedAbilities,
            description = description
        )
    }

    fun mapEvolutionSpecies(
        evolutionChain: EvolutionChainDto?
    ): List<PokemonSpecies> {
        return evolutionChain
            ?.let { flattenEvolutionChain(it.chain) }
            ?: emptyList()
    }

    private fun flattenEvolutionChain(
        link: EvolutionChainLinkDto,
        evolvesFromSpeciesId: Int? = null
    ): List<PokemonSpecies> {
        val currentSpeciesId = extractIdFromUrl(link.species.url)
        val evolutionDetail = link.evolutionDetails.firstOrNull()

        val itemName = evolutionDetail?.item?.name
            ?: evolutionDetail?.heldItem?.name

        val current = PokemonSpecies(
            id = currentSpeciesId,
            name = link.species.name,
            evolvesFromSpeciesId = evolvesFromSpeciesId,
            evolutionMethod = formatEvolutionMethod(evolutionDetail),
            evolutionItemName = itemName,
            evolutionItemImageUrl = itemName?.let {
                getItemSpriteUrl(it)
            }
        )

        return listOf(current) + link.evolvesTo.flatMap { child ->
            flattenEvolutionChain(child, currentSpeciesId)
        }
    }

    fun extractIdFromUrl(url: String): Int {
        return url.trimEnd('/').substringAfterLast('/').toIntOrNull() ?: 0
    }

    fun extractEvolutionChainId(url: String?): Int? {
        return url
            ?.trimEnd('/')
            ?.substringAfterLast('/')
            ?.toIntOrNull()
    }

    private fun String.cleanText(): String {
        return replace("\n", " ")
            .replace("\u000C", " ")
            .replace(Regex("\\s+"), " ")
            .trim()
    }

    private fun formatEvolutionMethod(detail: EvolutionDetailDto?): String? {
        if (detail == null) return null

        return when {
            detail.minLevel != null -> "Lvl ${detail.minLevel}"

            detail.item != null -> formatApiName(detail.item.name)

            detail.minHappiness != null -> "High friendship"

            detail.minBeauty != null -> "Beauty ${detail.minBeauty}"

            detail.minAffection != null -> "High affection"

            detail.heldItem != null -> "Hold ${formatApiName(detail.heldItem.name)}"

            detail.knownMove != null -> "Know ${formatApiName(detail.knownMove.name)}"

            detail.knownMoveType != null -> "Know ${formatApiName(detail.knownMoveType.name)} move"

            detail.location != null -> "At ${formatApiName(detail.location.name)}"

            detail.needsOverworldRain == true -> "During rain"

            detail.turnUpsideDown == true -> "Turn upside down"

            detail.trigger?.name == "trade" -> "Trade"

            detail.trigger?.name == "level-up" -> "Level up"

            detail.trigger?.name == "use-item" -> "Use item"

            detail.trigger?.name == "shed" -> "Special evolution"

            detail.trigger != null -> formatApiName(detail.trigger.name)

            else -> null
        }
    }

    private fun getItemSpriteUrl(itemName: String): String {
        return "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/items/$itemName.png"
    }



    private fun formatApiName(value: String): String {
        return value
            .split("-")
            .joinToString(" ") { word ->
                word.replaceFirstChar { it.uppercase() }
            }
    }
}