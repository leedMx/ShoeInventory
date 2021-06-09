package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {
    private lateinit var binding : FragmentInstructionsBinding

    override fun onCreateView(
        li: LayoutInflater, vg: ViewGroup?, bundle: Bundle?): View {
        binding = DataBindingUtil.inflate(
            li, R.layout.fragment_instructions, vg, false)
        return binding.root
    }
}