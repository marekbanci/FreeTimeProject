package com.example.freetimeproject.data.response

import kotlinx.serialization.Serializable

@Serializable
data class PokemonResponse(
    val count: Int,
    val next: String? = null,
    val previous: String? = null,
    val results: List<Pokemons>,
)

@Serializable
data class Pokemons(
    val name: String,
    val url: String
)