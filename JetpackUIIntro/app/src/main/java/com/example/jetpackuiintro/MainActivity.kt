package com.example.jetpackuiintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.jetpackuiintro.nav.NavGraph
import com.example.jetpackuiintro.ui.theme.JetpackUIIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackUIIntroTheme {
                NavGraph()
            }
        }
    }
}
