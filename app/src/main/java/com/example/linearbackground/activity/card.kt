package com.example.linearbackground.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.linearbackground.R
import com.example.linearbackground.databinding.ActivityCardBinding

class card : AppCompatActivity() {
    private lateinit var binding: ActivityCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}