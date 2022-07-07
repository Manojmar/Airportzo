package com.example.linearbackground.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.linearbackground.R
import com.example.linearbackground.databinding.ActivitySmpcardBinding

class smpcard : AppCompatActivity() {
    private lateinit var binding: ActivitySmpcardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySmpcardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}