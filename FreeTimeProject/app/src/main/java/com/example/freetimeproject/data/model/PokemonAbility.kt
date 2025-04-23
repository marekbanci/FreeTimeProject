package com.example.freetimeproject.data.model


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonAbility(
    val ability: ApiResources? = null,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    val slot: Int
)