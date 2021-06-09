package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class WelcomeFragment : Fragment() {
    override fun onCreateView(
        li: LayoutInflater, vg: ViewGroup?, bundle: Bundle?
    ): View? {
        return li.inflate(R.layout.fragment_welcome, vg, false)
    }
}