package com.example.linearbackground.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.linearbackground.R
import com.example.linearbackground.databinding.ActivitySampleBinding

class sample : AppCompatActivity() {
   private lateinit var sampleBinding:ActivitySampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sampleBinding= ActivitySampleBinding.inflate(layoutInflater)
        setContentView(sampleBinding.root)
    }
}