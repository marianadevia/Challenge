package com.example.mobdevchallenge.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobdevchallenge.databinding.BreedItemBinding

class BreedAdapter(
    var breedDataSet: List<String>,
    val onItemClickListener: OnItemClickListener
) : RecyclerView.Adapter<BreedAdapter.BreedViewHolder>() {

    inner class BreedViewHolder(binding: BreedItemBinding): RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        var breedName = binding.tvBreed

        var view = itemView.setOnClickListener(this)
        override fun onClick(p0: View?) {
            onItemClickListener.onItemClick(breedDataSet[bindingAdapterPosition])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreedViewHolder {
        val binding = BreedItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return BreedViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BreedViewHolder, position: Int) {
        holder.breedName.text = breedDataSet[position]
    }

    override fun getItemCount(): Int = breedDataSet.size

    fun updateDataSet( newDataSet: List<String>) {
        breedDataSet = newDataSet
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun onItemClick(data: String)
    }

}

