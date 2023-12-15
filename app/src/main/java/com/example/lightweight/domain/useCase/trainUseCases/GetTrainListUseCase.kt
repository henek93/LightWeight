package com.example.lightweight.domain.useCase.trainUseCases

import com.example.lightweight.domain.repository.TrainRepository
import javax.inject.Inject

class GetTrainListUseCase @Inject constructor(
    private val repository: TrainRepository
) {

    fun getTrainList() = repository.getTrainsList()
}