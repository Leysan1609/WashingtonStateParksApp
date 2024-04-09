package com.example.washingtonparksapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.washingtonparksapp.databinding.ItemLayoutBinding

class ParkItemsAdapter(private var items: ArrayList<ParkItems>, private var parkItemAdapterActions: ParkItemAdapterActions): RecyclerView.Adapter<ParkItemsAdapter.ParkItemsViewHolder>() {

    inner class ParkItemsViewHolder(var binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkItemsViewHolder {
        return ParkItemsViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ParkItemsViewHolder, position: Int) {
        val item = items[position]
        holder.binding.cardImage.setImageResource(item.image)
        holder.binding.cardTitle.setText (item.title)
        holder.itemView.setOnClickListener {
            parkItemAdapterActions.onItemClicked(item)
        }
    }

    interface ParkItemAdapterActions {
        fun onItemClicked (parkItems: ParkItems)
    }

}