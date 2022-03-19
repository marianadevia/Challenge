package com.example.mobdevchallenge.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.mobdevchallenge.R
import com.example.mobdevchallenge.core.Resource
import com.example.mobdevchallenge.data.remote.BreedDataSource
import com.example.mobdevchallenge.databinding.FragmentBreedBinding
import com.example.mobdevchallenge.domain.BreedRepositoryImpl
import com.example.mobdevchallenge.domain.RetrofitClient
import com.example.mobdevchallenge.presentation.BreedViewModel
import com.example.mobdevchallenge.presentation.BreedViewModelFactory

class BreedFragment : Fragment(R.layout.fragment_breed) {

    private lateinit var binding: FragmentBreedBinding
    private val viewModel by viewModels<BreedViewModel> {
        BreedViewModelFactory(BreedRepositoryImpl(BreedDataSource(RetrofitClient.webService)
            )) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBreedBinding.bind(view)

        viewModel.fetchBreedList().observe(viewLifecycleOwner, Observer {
            when(it){
                is Resource.Loading->{
                    Log.i("liveData", "Loading...")
                }
                is Resource.Success-> {
                    Log.i("liveDataSuccess", it.data.message.toString())
                }
                is Resource.Failure ->{
                    Log.i("liveDataError", it.exception.toString())
                }
            }
        })
    }
}