package com.example.freetimeproject.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HeldItems (
    val item: ApiResources,
    @SerialName("version_details")
    val versionDetails: List<ApiResources>
)