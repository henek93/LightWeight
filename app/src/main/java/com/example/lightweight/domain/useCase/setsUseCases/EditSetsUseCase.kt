package com.example.lightweight.domain.useCase.setsUseCases

import com.example.lightweight.domain.enteties.Sets
import com.example.lightweight.domain.repository.SetsRepository
import javax.inject.Inject

class EditSetsUseCase @Inject constructor(
    private val repository: SetsRepository
){

    suspend fun editSets(set: Sets){
        repository.editSets(set)
    }
}