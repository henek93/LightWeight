package com.example.lightweight.domain.useCase.trainUseCases

import com.example.lightweight.domain.enteties.Train
import com.example.lightweight.domain.repository.TrainRepository
import javax.inject.Inject

class EditTrainUseCase @Inject constructor(
    private val repository: TrainRepository
) {

    suspend fun editTrain(train: Train){
        repository.editTrain(train)
    }
}