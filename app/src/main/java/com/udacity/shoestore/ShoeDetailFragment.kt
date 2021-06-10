package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.models.Shoe
import timber.log.Timber
import java.util.*

class ShoeDetailFragment : Fragment() {
    private lateinit var binding: FragmentShoeDetailBinding

    override fun onCreateView(
        li: LayoutInflater, vg: ViewGroup?, bundle: Bundle?): View {
        binding = DataBindingUtil.inflate(
            li, R.layout.fragment_shoe_detail, vg, false)
        val navController = findNavController()
        val directions = ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment()
        binding.shoe = Shoe()

        binding.saveButton.setOnClickListener {
            Timber.i(binding.shoe.toString())
            navController.navigate(directions)
        }
        binding.cancelButton.setOnClickListener {
            navController.navigate(directions)
        }
        return binding.root
    }
}