package com.example.freetimeproject.data.model

import com.google.gson.annotations.SerializedName


data class HeldItems (
    val item: ApiResources,
    @SerializedName("version_details")
    val versionDetails: List<ApiResources>
)