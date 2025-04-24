package com.example.freetimeproject.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GameDetail(
    @SerialName("game_index")
    val gameIndex: Int = 0,
    val rarity: Int = 0,
    val version: ApiResources
)