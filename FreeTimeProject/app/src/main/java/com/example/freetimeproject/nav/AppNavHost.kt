package com.example.freetimeproject.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.freetimeproject.data.network.ApiClient
import com.example.freetimeproject.screens.PokemonList
import com.example.freetimeproject.viewmodels.PokemonListVM

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { PokemonList(navController, viewModel = PokemonListVM(ApiClient.providePokemonApi())) }
        composable("details") {  }
    }
}