package com.example.freetimeproject.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiResources(
    val name: String,
    val url: String
)