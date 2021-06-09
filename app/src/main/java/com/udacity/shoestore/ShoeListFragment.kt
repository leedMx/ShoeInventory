package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.databinding.FragmentShoeListBinding

class ShoeListFragment : Fragment() {
    private lateinit var binding : FragmentShoeListBinding
    override fun onCreateView(
        li: LayoutInflater, vg: ViewGroup?, bundle: Bundle?): View {
        binding = DataBindingUtil.inflate(
            li,R.layout.fragment_shoe_list, vg, false)
        return binding.root
    }
}