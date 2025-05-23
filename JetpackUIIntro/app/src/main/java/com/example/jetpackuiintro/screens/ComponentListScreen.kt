package com.example.jetpackuiintro.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ComponentListScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("UI Components List", color = Color.Blue, style = MaterialTheme.typography.titleLarge)

        Spacer(Modifier.height(8.dp))

        ComponentCard("Text", "Displays text") { navController.navigate("text") }
        ComponentCard("Image", "Displays an image") { navController.navigate("image") }
        ComponentCard("TextField", "Input field for text") { navController.navigate("textfield") }
        ComponentCard("PasswordField", "Input field for passwords") { navController.navigate("passwordfield") }
        ComponentCard("Column", "Arranges elements vertically") { navController.navigate("column") }
        ComponentCard("Row", "Arranges elements horizontally") { navController.navigate("row") }

        Spacer(modifier = Modifier.height(8.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFCDD2))
                .padding(16.dp)
        ) {
            Text("Tự tìm hiểu\nTìm ra tất cả các thành phần UI Cơ bản")
        }
    }
}

@Composable
fun ComponentCard(title: String, description: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .clickable { onClick() },
        colors = CardDefaults.cardColors(containerColor = Color(0xFFBBDEFB))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(title, style = MaterialTheme.typography.titleMedium)
            Text(description)
        }
    }
}
