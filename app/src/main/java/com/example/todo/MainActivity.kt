package com.example.todo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.todo.presentation.navigation.TodoNavGraph
import com.example.todo.ui.theme.ToDoTheme
import com.google.firebase.FirebaseApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // initialize firebase for the app
        FirebaseApp.initializeApp(this)
        setContent {
            ToDoTheme {
                val navController = rememberNavController()
                TodoNavGraph(navController)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        // CUSTOM ONSTART LOGIC FOR THIS ACTIVITY
    }



}










