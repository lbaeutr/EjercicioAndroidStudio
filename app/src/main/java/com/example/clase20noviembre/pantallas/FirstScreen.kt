package com.example.clase20noviembre.pantallas

import android.text.Layout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.clase20noviembre.navegacion.AppScreen

@Composable
fun FirstScreen(navController: NavController) {
    FirstBody(navController)

}

//@Preview(name = "Prueba")
@Composable
fun FirstBody(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola")

        Button(onClick = { navController.navigate(route = AppScreen.SecondScreen.route + "/")  }) {
            Text(text = "Ir a la segunda pantalla")
        }
    }
}