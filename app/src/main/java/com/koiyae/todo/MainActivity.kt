package com.koiyae.todo

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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.koiyae.todo.ui.theme.ToDoTheme
import com.koiyae.todo.view.SaveTask
import com.koiyae.todo.view.TaskList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "listaTarefas"
                ) {
                    composable(
                        route = "listaTarefas"
                    ) {
                        TaskList(navController)
                    }

                    composable(
                        route = "salvarTarefa"
                    ) {
                        SaveTask(navController)
                    }
                }
            }
        }
    }
}
