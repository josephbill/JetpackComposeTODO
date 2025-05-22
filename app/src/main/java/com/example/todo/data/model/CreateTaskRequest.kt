package com.example.todo.data.model
// model will define the body for our
// post request i.e. posting a task via
// our API
data class CreateTaskRequest(
    val title: String,
    val completed: Boolean = false,
    val tasker: Int,
    val user: Int? = null
)
