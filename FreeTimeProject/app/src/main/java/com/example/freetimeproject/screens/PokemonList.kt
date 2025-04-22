package com.example.freetimeproject.screens

import android.util.Log
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.freetimeproject.components.PokemonListItem
import com.example.freetimeproject.viewmodels.PokemonListVM

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PokemonList(navController: NavController, viewModel: PokemonListVM) {
    val pokemons by viewModel.pokemons.observeAsState(emptyList())
    val listState = rememberLazyListState()

    LaunchedEffect(Unit) {
        if (pokemons.isEmpty()) {
            Log.d("OrdersScreen", "Načítám první stránku...")

            viewModel.fetchPokemons()

        }
    }

    LaunchedEffect(listState) {
        snapshotFlow { listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index }
            .collect { lastVisibleItemIndex ->
                if (lastVisibleItemIndex != null && lastVisibleItemIndex >= pokemons.size - 1) {
                    viewModel.fetchPokemons()
                }
            }
    }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Pokemons") }) }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 24.dp),
            state = listState,
            contentPadding = PaddingValues(vertical = 8.dp)
        ) {
            items(pokemons) { item ->
                PokemonListItem(item.name, onClick = {

                })
            }
        }
    }

}