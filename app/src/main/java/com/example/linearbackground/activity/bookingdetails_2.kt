package com.example.linearbackground.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.linearbackground.R
import com.example.linearbackground.databinding.ActivityBookingdetails2Binding

class bookingdetails_2 : AppCompatActivity() {
    private lateinit var binding: ActivityBookingdetails2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBookingdetails2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}