package com.example.freetimeproject.data.model


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class GameDetail(
    @SerializedName("game_index")
    val gameIndex: Int = 0,
    val rarity: Int = 0,
    val version: ApiResources
)