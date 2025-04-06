package com.emerson.pokeapp.domain.usecases

import com.emerson.pokeapp.domain.model.TypeEffectiveness
import com.emerson.pokeapp.domain.model.defenseMultipliers

class TypeCalculatorUseCase {

    fun getDefensiveEffectiveness(
        pokemonTypes: List<String>
    ): TypeEffectiveness {

        val weakTo = mutableListOf<String>()
        val resistantTo = mutableListOf<String>()
        val immuneTo = mutableListOf<String>()
        val finalEffectiveness = mutableMapOf<String, Double>()

      pokemonTypes.forEach { type ->
         defenseMultipliers[type]?.forEach { (defenderType, effectiveness) ->
             val currentEffectiveness = finalEffectiveness.getOrDefault(defenderType, 1.0)
             val newEffectiveness = currentEffectiveness * effectiveness
             finalEffectiveness[defenderType] = currentEffectiveness * newEffectiveness
         }
      }
        finalEffectiveness.forEach { (defenderType, effectiveness) ->
            when{
                effectiveness == 0.0 -> immuneTo.add(defenderType)
                effectiveness < 1.0 -> resistantTo.add(defenderType)
                effectiveness > 1.0 -> weakTo.add(defenderType)
            }
        }
        return TypeEffectiveness(weakTo, resistantTo, immuneTo)
    }
}

