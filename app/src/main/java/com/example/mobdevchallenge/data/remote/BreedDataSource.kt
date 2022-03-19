package com.example.mobdevchallenge.data.remote

import com.example.mobdevchallenge.data.model.BreedResponse
import com.example.mobdevchallenge.domain.WebService

class BreedDataSource(private val webService: WebService) {

    suspend fun getBreedList() : BreedResponse = webService.getBreedResponse()
}