package com.example.lightweight.domain.useCase.trainUseCases

import com.example.lightweight.domain.enteties.Train
import com.example.lightweight.domain.repository.TrainRepository
import javax.inject.Inject

class DeleteTrainUseCase @Inject constructor(
    private val repository: TrainRepository
) {

    suspend fun deleteTrain(train: Train){
        repository.deleteTrain(train)
    }
}