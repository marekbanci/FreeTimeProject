package com.example.freetimeproject.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.freetimeproject.data.network.ApiPokemon
import com.example.freetimeproject.data.network.UiState
import com.example.freetimeproject.data.response.PokemonDetailResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonDetailVM @Inject constructor(
    private val apiPokemon: ApiPokemon,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _pokemonDetail = MutableLiveData<UiState<PokemonDetailResponse>>()
    val pokemonDetail: LiveData<UiState<PokemonDetailResponse>> get() = _pokemonDetail

    init {
        val name: String = savedStateHandle["name"] ?: ""
        getPokemonDetail(name)
    }

    fun getPokemonDetail(name: String) {
        _pokemonDetail.value = UiState.Loading
        viewModelScope.launch {
            try {
                val response = apiPokemon.getPokemonDetail(name)
                _pokemonDetail.value = UiState.Success(response)
            } catch (e: Exception) {
                _pokemonDetail.value = UiState.Error(e.message ?: "Unknown error")
            }
        }
    }
}