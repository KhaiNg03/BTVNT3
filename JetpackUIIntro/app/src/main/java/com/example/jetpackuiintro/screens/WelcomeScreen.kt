package com.example.jetpackuiintro.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackuiintro.R

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Column(horizontalAlignment = Alignment.End) {
                Text("Nguyễn Văn A", fontWeight = FontWeight.Bold)
                Text("2342312323")
            }
        }

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Jetpack Logo",
            modifier = Modifier.size(160.dp)
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Jetpack Compose", fontWeight = FontWeight.Bold)
            Text(
                text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
                textAlign = androidx.compose.ui.text.style.TextAlign.Center
            )
        }

        Button(onClick = { navController.navigate("components") }) {
            Text("I’m ready")
        }
    }
}
