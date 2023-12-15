package com.example.lightweight.domain.repository

import com.example.lightweight.domain.enteties.Train
import kotlinx.coroutines.flow.StateFlow

interface TrainRepository {

    suspend fun addTrain(train: Train)

    suspend fun deleteTrain(train: Train)

    suspend fun editTrain(train: Train)

    suspend fun getTrain(trainId: Int): Train

    fun getTrainsList(): StateFlow<List<Train>>

}