package com.emerson.pokeapp.domain.usecases

import com.emerson.pokeapp.domain.model.TypeEffectiveness
import com.emerson.pokeapp.domain.model.defenseMultipliers

class TypeCalculatorUseCase {

    fun getDefensiveEffectiveness(
        pokemonTypes: List<String>
    ): TypeEffectiveness {
        val veryResistantTo = mutableListOf<String>()
        val veryWeakTo = mutableListOf<String>()
        val weakTo = mutableListOf<String>()
        val resistantTo = mutableListOf<String>()
        val immuneTo = mutableListOf<String>()
        val finalEffectiveness = mutableMapOf<String, Double>()

        pokemonTypes.forEach { type ->
            defenseMultipliers[type]?.forEach { (defenderType, effectiveness) ->
                val currentEffectiveness = finalEffectiveness.getOrDefault(defenderType, 1.0)
                val newEffectiveness = currentEffectiveness * effectiveness
                finalEffectiveness[defenderType] = newEffectiveness
            }
        }
        finalEffectiveness.forEach { (defenderType, effectiveness) ->
            when {
                effectiveness == 0.0 -> immuneTo.add(defenderType)
                effectiveness == 0.5 -> resistantTo.add(defenderType)
                effectiveness in 0.1..0.5 -> veryResistantTo.add(defenderType)
                effectiveness in 1.1..2.0 -> weakTo.add(defenderType)
                effectiveness > 2.1 -> veryWeakTo.add(defenderType)
            }
        }
        return TypeEffectiveness(
            veryWeakTo = veryWeakTo,
            weakTo = weakTo,
            resistantTo = resistantTo,
            veryResistantTo = veryResistantTo,
            immuneTo = immuneTo
        )
    }
}

