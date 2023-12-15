package com.example.lightweight.domain.useCase.exerciseUseCases

import com.example.lightweight.domain.repository.ExerciseRepository
import javax.inject.Inject

class GetExerciseListUseCase @Inject constructor(
    private val repository: ExerciseRepository
){

    fun getExerciseList() = repository.getExerciseList()
}