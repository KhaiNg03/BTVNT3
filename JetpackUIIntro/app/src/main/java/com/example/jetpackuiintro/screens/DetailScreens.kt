package com.example.jetpackuiintro.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.jetpackuiintro.R

@Composable
fun TextScreen() {
    var text by remember { mutableStateOf("Editable text here") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("This is a Text component")
            Spacer(modifier = Modifier.height(8.dp))
            Text("Hello, Jetpack Compose!")
            Spacer(modifier = Modifier.height(16.dp))
            Text("Below is a BasicTextField:")
            BasicTextField(
                value = text,
                onValueChange = { text = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
        }
    }
}

@Composable
fun ImageScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Image from resources:")
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Local image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("Image from Internet:")
            AsyncImage(
                model = "https://randomuser.me/api/portraits/men/1.jpg",
                contentDescription = "Network image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun TextFieldScreen() {
    var text by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Enter some text:")
            TextField(
                value = text,
                onValueChange = { text = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Type something...") }
            )
        }
    }
}

@Composable
fun PasswordFieldScreen() {
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Enter your password:")
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Password") },
                visualTransformation = PasswordVisualTransformation()
            )
        }
    }
}

@Composable
fun ColumnScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("This is a Column:")
            Spacer(modifier = Modifier.height(8.dp))
            Text("Item 1")
            Text("Item 2")
            Text("Item 3")
        }
    }
}

@Composable
fun RowScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Left")
            Text("Center")
            Text("Right")
        }
    }
}
