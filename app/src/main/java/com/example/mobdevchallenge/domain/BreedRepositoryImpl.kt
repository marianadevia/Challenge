package com.example.mobdevchallenge.domain

import com.example.mobdevchallenge.data.model.BreedResponse
import com.example.mobdevchallenge.data.remote.BreedDataSource

class BreedRepositoryImpl(private val dataSource: BreedDataSource): BreedRepository {

    override suspend fun getBreedResponse(): BreedResponse = dataSource.getBreedList()
}