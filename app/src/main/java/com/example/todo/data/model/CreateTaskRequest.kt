package com.example.todo.data.model
import com.google.gson.annotations.SerializedName  // to ensure all fields are received on post
// model will define the body for our
// post request i.e. posting a task via
// our API
data class CreateTaskRequest(
    @SerializedName("tasker")
    val tasker: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("completed")
    val completed: Boolean = false,
    @SerializedName("user")
    val user: Int? = null
)
