package com.example.linearbackground.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.linearbackground.R
import com.example.linearbackground.databinding.FragmentProfileBinding


class profileFragment : Fragment() {
private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
       binding=FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }
    }
