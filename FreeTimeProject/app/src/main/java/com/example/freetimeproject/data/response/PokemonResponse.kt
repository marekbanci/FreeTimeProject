package com.example.freetimeproject.data.response

import com.example.freetimeproject.data.model.ApiResources
import kotlinx.serialization.Serializable

@Serializable
data class PokemonResponse(
    val count: Int,
    val next: String? = null,
    val previous: String? = null,
    val results: List<ApiResources>,
)
