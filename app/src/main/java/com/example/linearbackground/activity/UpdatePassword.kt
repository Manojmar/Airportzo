package com.example.linearbackground.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.linearbackground.databinding.ActivityUpdatePasswordBinding

class UpdatePassword : AppCompatActivity() {
    private lateinit var binding: ActivityUpdatePasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUpdatePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener{
            startActivity(Intent(this, HomeActivity::class.java))
        }

    }
}