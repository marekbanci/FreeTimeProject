package com.example.freetimeproject.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Other(
    @SerialName("dream_world")
    val dreamWorld: AnimatedSprites,
    val home: AnimatedSprites,
    @SerialName("official-artwork")
    val officialArtwork: AnimatedSprites,
    val showDown: AnimatedSprites
)