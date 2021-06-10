package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.models.Shoe

class ShoeDetailFragment : Fragment() {
    private lateinit var binding: FragmentShoeDetailBinding
    private lateinit var viewModel: ShoeListViewModel

    override fun onCreateView(
        li: LayoutInflater, vg: ViewGroup?, bundle: Bundle?): View {
        viewModel = ViewModelProvider(requireActivity()).get(ShoeListViewModel::class.java)
        binding = DataBindingUtil.inflate(
            li, R.layout.fragment_shoe_detail, vg, false)
        binding.shoe = Shoe()
        addListeners()
        return binding.root
    }

    private fun addListeners() {
        val navController = findNavController()
        val directions = ShoeDetailFragmentDirections
            .actionShoeDetailFragmentToShoeListFragment()
        binding.saveButton.setOnClickListener {
            navController.navigate(directions)
            viewModel.addShoe(binding.shoe!!)
        }
        binding.cancelButton.setOnClickListener {
            navController.navigate(directions)
        }
    }
}