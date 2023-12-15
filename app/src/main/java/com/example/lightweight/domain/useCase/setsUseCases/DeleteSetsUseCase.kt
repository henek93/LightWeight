package com.example.lightweight.domain.useCase.setsUseCases

import com.example.lightweight.domain.enteties.Sets
import com.example.lightweight.domain.repository.SetsRepository
import javax.inject.Inject

class DeleteSetsUseCase @Inject constructor(
    private val repository: SetsRepository
){

    suspend fun deleteSets(set: Sets){
        repository.deleteSets(set)
    }
}