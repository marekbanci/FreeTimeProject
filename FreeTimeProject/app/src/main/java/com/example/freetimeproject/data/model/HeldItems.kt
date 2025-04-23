package com.example.freetimeproject.data.model

import kotlinx.serialization.SerialName

data class HeldItems (
    val item: ApiResources,
    @SerialName("version_details")
    val versionDetails: List<ApiResources>
)