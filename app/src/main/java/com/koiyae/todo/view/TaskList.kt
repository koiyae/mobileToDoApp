package com.koiyae.todo.view

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun TaskList(
    navController: NavController
) {
    Text(text = "Lista de tarefas")
}