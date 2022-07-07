package com.example.linearbackground.activity

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import com.example.linearbackground.R
import com.example.linearbackground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor= Color.WHITE
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )

        val path ="android.resource://" + packageName +"/" + R.raw.airportzoloader
        binding.videoview.setVideoPath(path)
        binding.videoview.setOnCompletionListener {
            val r= object :Runnable{
                override fun run() {
                    val intent = Intent(this@MainActivity, Login::class.java)
                    startActivity(intent)
                    finish()
                }
            }
            Handler().postDelayed(r,1000)
        }
          binding.videoview.start()
        }
    }
