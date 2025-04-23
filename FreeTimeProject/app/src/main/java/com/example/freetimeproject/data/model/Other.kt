package com.example.freetimeproject.data.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Other(
    @SerializedName("dream_world")
    val dreamWorld: Images,
    val home: Images,
    @SerializedName("official-artwork")
    val officialArtwork: Images,
    val showDown: Images
)