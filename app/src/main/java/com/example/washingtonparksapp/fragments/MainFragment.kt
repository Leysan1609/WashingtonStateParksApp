package com.example.washingtonparksapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.washingtonparksapp.ParkItems
import com.example.washingtonparksapp.ParkItemsAdapter
import com.example.washingtonparksapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var parkItemsAdapter: ParkItemsAdapter
    private lateinit var parkItemsList: ArrayList<ParkItems>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        parkItemsList = ParkItems.parkItemsList
        parkItemsAdapter = ParkItemsAdapter(parkItemsList, object : ParkItemsAdapter.ParkItemAdapterActions {
            override fun onItemClicked(parkItems: ParkItems) {
                view.findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailsFragment(parkItems))
            }
        })
        binding.recyclerView.adapter = parkItemsAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.setHasFixedSize(true)



    }

}