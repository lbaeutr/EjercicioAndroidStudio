package com.example.clase20noviembre.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.clase20noviembre.pantallas.FirstScreen
import com.example.clase20noviembre.pantallas.SecondScreend


@Composable
fun AppNavigation() {

    val navControlador = rememberNavController()

    NavHost(navController = navControlador, startDestination = AppScreen.FirstScreen.route) {
        composable(AppScreen.FirstScreen.route) {
            FirstScreen(navControlador)
        }
        composable(AppScreen.SecondScreen.route +"/{text}",
            arguments = listOf(navArgument("text") { type = NavType.StringType })) {
            SecondScreend(navControlador, it.arguments?.getString("text") )
        }
    }


}