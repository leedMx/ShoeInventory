package com.udacity.shoestore

import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.Shoe
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
        setHasOptionsMenu(true)
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
        { list -> for (shoe in list) makeShoeRow(shoe) }
    }

    private fun makeShoeRow(shoe: Shoe) {
        val textView = TextView(requireContext())
        with(shoe) {
            val text = String.format(
                "Name:%s Size:%s%nCompany:%s %nDescription:%s",
                name, size, company, description
            )
            textView.text = text
        }
        binding.shoesLinearLayout.addView(textView)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.logout_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,findNavController()) ||
                super.onOptionsItemSelected(item)
    }
}