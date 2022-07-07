package com.example.linearbackground.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.linearbackground.R
import com.example.linearbackground.databinding.FragmentBookingBinding


class bookingFragment : Fragment() {
private lateinit var binding: FragmentBookingBinding
private lateinit var viewPager2: ViewPager2
private lateinit var tableLayout: TableLayout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding=FragmentBookingBinding.inflate(inflater,container,false)

        binding.tab
        binding.view
        return binding.root
    }
}