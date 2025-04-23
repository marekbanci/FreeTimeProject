package com.example.freetimeproject.data.model

import com.google.gson.annotations.SerializedName


data class Stat(
    @SerializedName("base_stat")
    val baseStat: Int,
    val effort: Int,
    val stat: ApiResources
)