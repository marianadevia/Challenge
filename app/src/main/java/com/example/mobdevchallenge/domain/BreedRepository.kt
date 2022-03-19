package com.example.mobdevchallenge.domain

import com.example.mobdevchallenge.data.model.BreedResponse

interface BreedRepository {

    suspend fun getBreedResponse(): BreedResponse
}