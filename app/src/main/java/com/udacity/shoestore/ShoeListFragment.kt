package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import timber.log.Timber

class ShoeListFragment : Fragment() {
    private lateinit var binding: FragmentShoeListBinding
    private lateinit var viewModel: ShoeListViewModel

    override fun onCreateView(
        li: LayoutInflater, vg: ViewGroup?, bundle: Bundle?
    ): View {
        viewModel = ViewModelProvider(requireActivity()).get(ShoeListViewModel::class.java)
        binding = DataBindingUtil.inflate(
            li, R.layout.fragment_shoe_list, vg, false
        )
        setListener()
        setObserver()
        return binding.root
    }

    private fun setListener() {
        binding.actionButton.setOnClickListener {
            findNavController().navigate(
                ShoeListFragmentDirections
                    .actionShoeListFragmentToShoeDetailFragment()
            )
        }
    }

    private fun setObserver() {
        viewModel.shoes.observe(viewLifecycleOwner)
        { list -> Timber.i(list.toString()) }
    }
}