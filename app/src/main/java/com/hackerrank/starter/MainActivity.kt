package com.hackerrank.starter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hackerrank.starter.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the view hierarchy and bind the object to it
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Set the view hierarchy as the current layout for the activity
        setContentView(binding.root)
        // Setup and add the HackerRank logo in the toolbar
        setSupportActionBar(binding.toolbar)
        Objects.requireNonNull(supportActionBar)?.setHomeAsUpIndicator(R.drawable.ic_logo)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}