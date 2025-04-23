package com.example.freetimeproject.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PastAbilities(
    val abilities: List<PokemonAbility>? = null,
    val generation: ApiResources
)
