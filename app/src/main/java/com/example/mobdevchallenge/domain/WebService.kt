package com.example.mobdevchallenge.domain

import com.example.mobdevchallenge.application.AppConstants
import com.example.mobdevchallenge.data.model.BreedResponse
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface WebService {
    @GET("/api/breeds/list")
    suspend fun getBreedResponse(): BreedResponse

    /*@GET("/api/breeds/list")
    suspend fun getBreedResponse(@Path () ): BreedResponse*/

}

object RetrofitClient {
    val webService by lazy {
        Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService::class.java)
    }
}