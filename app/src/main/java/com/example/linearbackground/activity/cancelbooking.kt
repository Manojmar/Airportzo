package com.example.linearbackground.activity

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.TextView
import com.example.linearbackground.R
import com.example.linearbackground.databinding.ActivityCancelbookingBinding


class cancelbooking : AppCompatActivity() {

    private lateinit var binding: ActivityCancelbookingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCancelbookingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btncancel.setOnClickListener {
            showDialog()
        }
    }

    private fun showDialog() {
        val dialog = Dialog(this@cancelbooking)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog)
        dialog.getWindow()!!.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val cancel = dialog.findViewById(R.id.textView8) as TextView
        val yes = dialog.findViewById(R.id.textView9) as TextView

        cancel.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}

