package com.example.freetimeproject.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Moves(
    val move: ApiResources,
    @SerialName("version_group_details")
    val versionGroupDetail: List<VersionGroupDetails>
)