package com.example.freetimeproject.data.network

import com.example.freetimeproject.data.response.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiPokemon {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int = 20,
        @Query("offset") offset: Int = 0
    ) : PokemonResponse
}