package com.example.freetimeproject.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Other(
    @SerialName("dream_world")
    val dreamWorld: Images,
    val home: Images,
    @SerialName("official-artwork")
    val officialArtwork: Images,
    val showDown: Images
)