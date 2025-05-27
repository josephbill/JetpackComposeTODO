package com.example.todo.data.repository

import com.example.todo.data.model.CreateTaskRequest
import com.example.todo.data.model.Task
import com.example.todo.data.services.TaskApiService

class ApiRepository(private val apiService: TaskApiService){
       suspend fun getTasks(): List<Task>{
           return apiService.getTasks()
       }
     suspend fun createTask(task: CreateTaskRequest) : Task {
         return apiService.createTask(task)
     }

    suspend fun updateTask(id:Int,task: CreateTaskRequest) : Task{
        return apiService.updateTask(id, task)
    }
    suspend fun deleteTask(id:Int) {
        return apiService.deleteTask(id)
    }
}










