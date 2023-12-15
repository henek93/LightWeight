package com.example.lightweight.domain.useCase.exerciseUseCases

import com.example.lightweight.domain.enteties.Exercise
import com.example.lightweight.domain.repository.ExerciseRepository
import javax.inject.Inject

class AddExerciseUseCase @Inject constructor(
    private val repository: ExerciseRepository
) {

    suspend fun addExercise(exercise: Exercise){
        repository.addExercise(exercise)
    }
}