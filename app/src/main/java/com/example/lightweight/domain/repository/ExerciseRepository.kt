package com.example.lightweight.domain.repository

import com.example.lightweight.domain.enteties.Exercise
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

interface ExerciseRepository {

    suspend fun addExercise(exercise: Exercise)

    suspend fun deleteExercise(exercise: Exercise)

    suspend fun editExercise(exercise: Exercise)

    suspend fun getExercise(exerciseId: Int): Exercise

    fun getExerciseList(): StateFlow<List<Exercise>>
}