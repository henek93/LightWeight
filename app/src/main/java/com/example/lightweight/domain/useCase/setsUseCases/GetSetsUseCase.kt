package com.example.lightweight.domain.useCase.setsUseCases

import com.example.lightweight.domain.repository.SetsRepository
import javax.inject.Inject

class GetSetsUseCase @Inject constructor(
    private val repository: SetsRepository
) {

    suspend fun getSets(setsId: Int) = repository.getSets(setsId)
}