package com.example.freetimeproject.data.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
class VersionGroupDetails (
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int,
    @SerializedName("move_learn_method")
    val moveLearnMethod: ApiResources,
    val order: String? = null,
    @SerializedName("version_group")
    val versionGroup: ApiResources
)