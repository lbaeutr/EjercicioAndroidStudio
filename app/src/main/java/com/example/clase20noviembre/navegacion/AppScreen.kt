package com.example.clase20noviembre.navegacion

import android.media.MediaRouter

sealed class AppScreen(val route: String) {

    // me da error con el object  simplemente por eso pongo data object
    object FirstScreen : AppScreen("FirstScreen")
    object SecondScreen : AppScreen("SecondScreen")


}