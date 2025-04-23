package com.example.freetimeproject.data.response

import com.example.freetimeproject.data.model.ApiResources
import com.example.freetimeproject.data.model.Cries
import com.example.freetimeproject.data.model.GameDetail
import com.example.freetimeproject.data.model.Generation
import com.example.freetimeproject.data.model.HeldItems
import com.example.freetimeproject.data.model.Moves
import com.example.freetimeproject.data.model.PastAbilities
import com.example.freetimeproject.data.model.PokemonAbility
import com.example.freetimeproject.data.model.Sprites
import com.example.freetimeproject.data.model.Stat
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonDetailResponse (
    val abilities: List<PokemonAbility>,
    @SerialName("base_experience")
    val baseExperience: Int,
    val cries: Cries,
    val forms: List<ApiResources>,
    @SerialName("game_indices")
    val gameIndices: List<GameDetail>,
    val height: Int,
    @SerialName("held_items")
    val heldItems: List<HeldItems>,
    val id: Int,
    @SerialName("is_default")
    val isDefault: Boolean,
    @SerialName("location_area_encounters")
    val locationAreaEncounters: String,
    val moves: List<Moves>,
    val name: String,
    val order: Int,
    @SerialName("past_abilities")
    val pastAbilities: List<PastAbilities>,
    val species: ApiResources,
    val sprites: Sprites,
    @SerialName("versions")
    val generations: Generation,
    val stats: List<Stat>,
    val weight: Int



)