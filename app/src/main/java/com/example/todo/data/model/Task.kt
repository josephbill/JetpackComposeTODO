package com.example.todo.data.model
// null fields represent the sections
// in json i.e. the backend that can be
// null
data class Task(
    val id: Int? = null,
    val tasker: Int?,               // or remove if unused
    val tasker_detail: Tasker?,     // ← use this instead  , with a null check
    val title: String,
    val completed: Boolean,
    val created_at: String? = null,
    val user: Int? = null,
)

