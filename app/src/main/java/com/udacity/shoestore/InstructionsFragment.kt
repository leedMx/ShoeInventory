package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {
    private lateinit var binding : FragmentInstructionsBinding

    override fun onCreateView(
        li: LayoutInflater, vg: ViewGroup?, bundle: Bundle?): View {
        binding = DataBindingUtil.inflate(
            li, R.layout.fragment_instructions, vg, false)
        binding.startButton.setOnClickListener(Listener())
        return binding.root
    }

    private fun Listener(): View.OnClickListener {
        return View.OnClickListener{view ->
            view.findNavController().navigate(
                InstructionsFragmentDirections
                    .actionInstructionsFragmentToShoeListFragment()
            )
        }
    }
}