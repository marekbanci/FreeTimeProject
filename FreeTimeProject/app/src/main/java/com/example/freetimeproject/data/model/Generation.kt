package com.example.freetimeproject.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Generation(
    val versions: Map<String, Images>
)