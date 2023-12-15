package com.example.lightweight.domain.enteties

data class Train(
    val id: Int,
    val duration: Long,
    val listOfExercise: List<Exercise>
)