package com.emerson.pokeapp.domain.model

import com.emerson.pokeapp.data.remote.responses.PokemonDto

 fun PokemonDto.toModel(): Pokemon = Pokemon(
     abilities = this.abilities,
     baseExperience = this.baseExperience,
     cries = this.cries,
     forms = this.forms,
     gameIndices = this.gameIndices,
     height = this.height,
     heldItems = this.heldItems,
     id = this.id,
     isDefault = this.isDefault,
     locationAreaEncounters = this.locationAreaEncounters,
     moves = this.moves,
     name = this.name,
     order = this.order,
     pastAbilities = this.pastAbilities,
     pastTypes = this.pastTypes,
     species = this.species,
     sprites = this.sprites,
     stats = this.stats,
     types = this.types,
     weight = this.weight
 )