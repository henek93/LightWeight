package com.example.lightweight.domain.useCase.trainUseCases

import com.example.lightweight.domain.repository.TrainRepository
import javax.inject.Inject

class GetTrainUseCase @Inject constructor(
    private val repository: TrainRepository
) {

    suspend fun getTrain(trainId: Int) = repository.getTrain(trainId)
}