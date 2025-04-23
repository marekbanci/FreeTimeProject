package com.example.freetimeproject.data.model

import kotlinx.serialization.Serializable

@Serializable
data class PokemonSprites(
    val versions: Map<String, Generation>
)