package com.example.freetimeproject.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class VersionGroupDetails (
    @SerialName("level_learned_at")
    val levelLearnedAt: Int,
    @SerialName("move_learn_method")
    val moveLearnMethod: ApiResources,
    val order: String? = null,
    @SerialName("version_group")
    val versionGroup: ApiResources
)