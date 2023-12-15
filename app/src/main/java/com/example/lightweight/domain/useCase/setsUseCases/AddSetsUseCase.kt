package com.example.lightweight.domain.useCase.setsUseCases

import com.example.lightweight.domain.enteties.Sets
import com.example.lightweight.domain.repository.ExerciseRepository
import com.example.lightweight.domain.repository.SetsRepository
import javax.inject.Inject

class AddSetsUseCase @Inject constructor(
    private val repository: SetsRepository
){

    suspend fun addSets(set: Sets){
        repository.addSets(set)
    }
}