package com.example.kotlin_9pract

import MyCustomTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyCustomTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    StudentInfoScreen()
                }
            }
        }
    }
}

@Composable
fun StudentInfoScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Керимов Эмиль Расимович",
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "ИКБО-11-22",
            fontSize = 50.sp,
            fontWeight = FontWeight.Normal
        )
    }
}