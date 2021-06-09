package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class LogFragment : Fragment() {

    override fun onCreateView(
        i: LayoutInflater, c: ViewGroup?, bundle: Bundle?): View? {
        return i.inflate(R.layout.fragment_login, c, false)
    }
}