package com.example.mobdevchallenge.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobdevchallenge.R
import com.example.mobdevchallenge.databinding.FragmentBreedBinding

class BreedFragment : Fragment(R.layout.fragment_breed) {

    private lateinit var binding: FragmentBreedBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBreedBinding.bind(view)
    }
}