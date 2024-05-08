package com.lennyrbriones.gamelistapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.lennyrbriones.gamelistapp.viewmodel.GamesViewModel
import com.lennyrbriones.gamelistapp.views.DetailView
import com.lennyrbriones.gamelistapp.views.HomeView

@Composable
fun NavManager(viewModel: GamesViewModel){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){
            HomeView(viewModel, navController)
        }
        composable("DetailView/{id}", arguments = listOf(
            navArgument("id"){ type = NavType.IntType}
        )){

            val id = it.arguments?.getInt("id") ?: 0 // start value

            DetailView(viewModel, navController, id)
        }
    }
}