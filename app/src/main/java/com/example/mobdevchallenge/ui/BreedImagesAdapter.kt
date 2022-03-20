package com.example.mobdevchallenge.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobdevchallenge.databinding.PicItemBinding
import com.squareup.picasso.Picasso

class BreedImagesAdapter(
    var breedImageDataSet: List<String>) : RecyclerView.Adapter<BreedImagesAdapter.BreedImageViewHolder>() {

    inner class BreedImageViewHolder(binding: PicItemBinding): RecyclerView.ViewHolder(binding.root) {

        var breedPic = binding.dogPic
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreedImageViewHolder {
        val binding = PicItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  BreedImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BreedImageViewHolder, position: Int) {
        Picasso.get().load(breedImageDataSet[position]).into(holder.breedPic)
    }

    override fun getItemCount(): Int = breedImageDataSet.size

    fun updateDataSet( newDataSet: List<String>) {
        breedImageDataSet = newDataSet
        notifyDataSetChanged()
    }


}
