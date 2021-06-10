package com.udacity.shoestore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.udacity.shoestore.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navigation: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.plant(Timber.DebugTree())
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        navigation = findNavController(R.id.nav_host_fragment)
        setupActionBarWithNavController(navigation)
    }

    override fun onSupportNavigateUp(): Boolean {
        navigation.navigateUp()
        return super.onSupportNavigateUp()
    }
}
