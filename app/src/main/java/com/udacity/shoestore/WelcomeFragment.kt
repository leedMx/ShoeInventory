package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreateView(
        li: LayoutInflater, vg: ViewGroup?, bundle: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            li, R.layout.fragment_welcome, vg, false)
        setListener()
        return binding.root
    }

    private fun setListener() {
        binding.instructionsButton.setOnClickListener {
            it.findNavController().navigate(
                WelcomeFragmentDirections
                    .actionWelcomeFragmentToInstructionsFragment()
            )
        }
    }
}