package com.example.lightweight.domain.repository

import com.example.lightweight.domain.enteties.Exercise
import com.example.lightweight.domain.enteties.Sets
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

interface SetsRepository {

    suspend fun addSets(set: Sets)

    suspend fun deleteSets(set: Sets)

    suspend fun editSets(set: Sets)

    suspend fun getSets(setsId: Int): Sets

    fun getSetsList(): StateFlow<List<Sets>>
}