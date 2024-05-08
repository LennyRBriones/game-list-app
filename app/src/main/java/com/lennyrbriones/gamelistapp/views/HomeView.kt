package com.lennyrbriones.gamelistapp.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.lennyrbriones.gamelistapp.viewmodel.GamesViewModel

@Composable
fun HomeView(viewModel: GamesViewModel){
    val games by viewModel.games.collectAsState()
    LazyColumn {
        items(games){item ->
            Text(text = item.name)
        }
    }
}