package com.example.linearbackground.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.linearbackground.R
import com.example.linearbackground.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.phone.setOnClickListener {
           binding.email.background = null
           binding.email.clearFocus()
           binding.phone.background = resources.getDrawable(R.drawable.switch_trunk,null)
            binding.editText.visibility = View.VISIBLE
            binding.editText1.visibility = View.GONE
            binding.phone.setTextColor(resources.getColor(R.color.white,null))
           binding.email.setTextColor(resources.getColor(R.color.Text,null))
        }
        binding.email.setOnClickListener {
            binding.phone.background = null
            binding.phone.clearFocus()
            binding.email.background = resources.getDrawable(R.drawable.switch_trunk,null)
            binding.editText.visibility = View.GONE
            binding.editText1.visibility = View.VISIBLE
            binding.email.setTextColor(resources.getColor(R.color.white,null))
            binding.phone.setTextColor(resources.getColor(R.color.Text,null))
        }
        binding.button1.setOnClickListener {
//            if (binding.phone.text.toString().isEmpty()) {
//                val email=binding.email.text.toString()
//                val emlpass=binding.editText2.text.toString()
                startActivity(Intent(this, UpdatePassword::class.java))
//            }
//            else if (binding.email.text.toString().isEmpty()) {
//                val phone=binding.phone.toString()
//                val phpass=binding.editText2.text.toString()
//                startActivity(Intent(this, UpdatePassword::class.java))
//            }
        }
    }
}