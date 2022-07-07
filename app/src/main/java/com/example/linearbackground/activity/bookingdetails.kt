package com.example.linearbackground.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.linearbackground.R
import com.example.linearbackground.databinding.ActivityBookingdetailsBinding

class bookingdetails : AppCompatActivity() {
    private lateinit var binding: ActivityBookingdetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBookingdetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.end.setOnClickListener{
            startActivity(Intent(this, cancelbooking::class.java))
        }
    }
}