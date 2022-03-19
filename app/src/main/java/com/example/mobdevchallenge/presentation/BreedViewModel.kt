package com.example.mobdevchallenge.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.mobdevchallenge.core.Resource
import com.example.mobdevchallenge.domain.BreedRepository
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

class BreedViewModel(private val repo: BreedRepository) : ViewModel() {
    fun fetchBreedList() = liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(repo.getBreedResponse()))
        }catch (e:Exception){
            emit(Resource.Failure(e))
        }
    }
}

class BreedViewModelFactory(private val repo: BreedRepository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(BreedRepository::class.java).newInstance(repo)
    }

}