package com.example.jetpackuiintro.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackuiintro.screens.*

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "welcome") {
        composable("welcome") { WelcomeScreen(navController) }
        composable("components") { ComponentListScreen(navController) }
        composable("text") { TextScreen() }
        composable("image") { ImageScreen() }
        composable("textfield") { TextFieldScreen() }
        composable("passwordfield") { PasswordFieldScreen() }
        composable("column") { ColumnScreen() }
        composable("row") { RowScreen() }
    }
}
