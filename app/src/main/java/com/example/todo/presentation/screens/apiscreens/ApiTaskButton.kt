package com.example.todo.presentation.screens.apiscreens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.todo.data.repository.ApiRepository
import com.example.todo.data.services.TaskApiService

// here implement a form to capture the values more dynamically
@Composable
fun ApiTaskButton(
    navController: NavController,
    viewModel: ApiViewModel = viewModel(
        factory = ApiViewModelFactory(
            ApiRepository(
            TaskApiService.create()
        )
        )
    )
){
      Button(onClick = {
          viewModel.postTasks(
              taskerId = 1,
              title = "New test for post process",  //remember in django this is unique
              completed = false,
              userId = null
          )
      }) {
          Text("Post to API")
      }

    //show feedback
    val result = viewModel.taskCreationState.value
    when {
        result?.isSuccess == true -> {
            val task = result.getOrNull()
            Text("Task created successfully, ${task?.title}")
        }
        result?.isFailure == true -> {
            val error = result.exceptionOrNull()
            Text("Error:, ${error?.message}")
        }
    }

}