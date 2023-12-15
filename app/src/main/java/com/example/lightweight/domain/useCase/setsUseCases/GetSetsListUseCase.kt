package com.example.lightweight.domain.useCase.setsUseCases

import com.example.lightweight.domain.repository.SetsRepository
import javax.inject.Inject

class GetSetsListUseCase @Inject constructor(
    private val repository: SetsRepository
){

    fun getSetsList() = repository.getSetsList()
}