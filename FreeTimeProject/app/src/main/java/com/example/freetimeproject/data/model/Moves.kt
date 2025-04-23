package com.example.freetimeproject.data.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class Moves(
    val move: ApiResources,
    @SerializedName("version_group_details")
    val versionGroupDetail: List<VersionGroupDetails>
)