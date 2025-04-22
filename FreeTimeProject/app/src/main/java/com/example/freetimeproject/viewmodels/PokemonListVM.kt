package com.example.freetimeproject.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.freetimeproject.data.network.ApiPokemon
import com.example.freetimeproject.data.response.Pokemons
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonListVM @Inject constructor(
    private val apiPokemon: ApiPokemon
) : ViewModel() {

    private val _pokemons = MutableLiveData<List<Pokemons>>(emptyList())
    val pokemons: LiveData<List<Pokemons>> get() = _pokemons

    private val _offset = MutableLiveData<Int>(0)
    val offset: LiveData<Int> get() = _offset

    fun fetchPokemons() {
        viewModelScope.launch {
            try {
                val response = apiPokemon.getPokemonList(limit = 20, offset = offset.value!!)
                _pokemons.value = _pokemons.value?.plus(response.results)
                _offset.value = _offset.value?.plus(20)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}