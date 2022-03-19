package com.example.mobdevchallenge.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobdevchallenge.R
import com.example.mobdevchallenge.databinding.FragmentPicsBinding

class PicsFragment : Fragment(R.layout.fragment_pics) {

    private lateinit var binding: FragmentPicsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPicsBinding.bind(view)
    }
}