package com.example.freetimeproject.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonAbility(
    val ability: ApiResources? = null,
    @SerialName("is_hidden")
    val isHidden: Boolean,
    val slot: Int
)