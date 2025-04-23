package com.example.freetimeproject.data.model

import kotlinx.serialization.SerialName

data class Images(
    @SerialName("back_default")
    val backDefault: String? = null,
    @SerialName("back_female")
    val backFemale: String? = null,
    @SerialName("back_shiny")
    val backShiny: String? = null,
    @SerialName("back_shiny_female")
    val backShinyFemale: String? = null,
    @SerialName("back_gray")
    val backGray: String? = null,
    @SerialName("back_transparent")
    val backTransparent: String? = null,
    @SerialName("front_default")
    val frontDefault: String? = null,
    @SerialName("front_female")
    val frontFemale: String? = null,
    @SerialName("front_shiny")
    val frontShiny: String? = null,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String? = null,
    @SerialName("front_gray")
    val frontGray: String? = null,
    @SerialName("front_transparent")
    val frontTransparent: String? = null


)