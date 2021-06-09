package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        i: LayoutInflater, c: ViewGroup?, bundle: Bundle?): View {
        binding = DataBindingUtil.inflate(
            i, R.layout.fragment_login, c, false)
        val listener = Listener()
        binding.loginButton.setOnClickListener(listener)
        binding.signupButton.setOnClickListener(listener)
        return binding.root
    }

    class Listener() : View.OnClickListener{
        override fun onClick(v: View) {
            v.findNavController().navigate(
                LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
        }
    }
}