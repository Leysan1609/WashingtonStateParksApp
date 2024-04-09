package com.example.washingtonparksapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.washingtonparksapp.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    private val parkItems: DetailsFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailsBinding.inflate(layoutInflater)
        view?.findNavController()?.navigate(DetailsFragmentDirections.actionDetailsFragmentToMainFragment())
        val items = parkItems.FillDataArgs
        binding.imageDetailed.setImageResource(items.imageDetail)
        binding.textDetailed.setText(items.textDetail)
        return binding.root

    }





}