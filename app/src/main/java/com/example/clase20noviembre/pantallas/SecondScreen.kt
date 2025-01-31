package com.example.clase20noviembre.pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController


@Composable
fun SecondScreend(navController: NavController, string: String?) {
    SecondBody(navController, string)

}

@Composable
fun SecondBody(navController: NavController, texto: String?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("De vuelta")
        }
        texto?.let{
            Text(it)
        }

    }
}