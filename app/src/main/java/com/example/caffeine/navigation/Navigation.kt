@file:Suppress("PLUGIN_IS_NOT_ENABLED")

package com.example.caffeine.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.caffeine.presentation.screen.HomeScreen
import com.example.caffeine.presentation.screen.PreparingScreen
import com.example.caffeine.presentation.screen.WelcomeScreen


sealed class Destination(val route: String) {
    object WelcomeScreen : Destination("WelcomeScreen")
    object PreparingScreen : Destination("PreparingScreen")
    object HomeScreen : Destination("HomeScreen")
}
@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController,
        startDestination = Destination.WelcomeScreen.route) {
        welcomeScreen(navController)
        homeScreen(navController)
        preparingScreen(navController)
    }
}
fun  NavGraphBuilder.welcomeScreen(navController : NavController){
    composable(route = Destination.WelcomeScreen.route) {
        WelcomeScreen(navController = navController , onClick = {navController.navigate(Destination.HomeScreen.route)})
    }

}

fun  NavGraphBuilder.homeScreen(navController : NavController){
    composable(route = Destination.HomeScreen.route) {
        HomeScreen(navController = navController , onClick = {navController.navigate(Destination.PreparingScreen.route)})
    }
}
fun  NavGraphBuilder.preparingScreen(navController : NavController){
    composable(route = Destination.PreparingScreen.route) {
        PreparingScreen(navController = navController)
    }

}