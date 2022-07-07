package com.example.linearbackground.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.linearbackground.Model.ongoing
import com.example.linearbackground.R
import com.example.linearbackground.activity.UpdatePassword
import com.example.linearbackground.activity.bookingdetails
import com.example.linearbackground.activity.cancelbooking
import com.example.linearbackground.adapter.onbookingAdapter
import com.example.linearbackground.adapter.upcomimgAdapter
import com.example.linearbackground.databinding.FragmentHomeBinding
import kotlinx.coroutines.currentCoroutineContext
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class homeFragment : Fragment() {

private lateinit var binding: FragmentHomeBinding
private lateinit var adapter:onbookingAdapter
 private lateinit var adapter1:upcomimgAdapter
private lateinit var model:ArrayList<ongoing>
private lateinit var model1:ArrayList<ongoing>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       binding=FragmentHomeBinding.inflate(inflater, container, false)

        /*Current Date*/
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd-LLL-yyyy")
        val currentDate = current.format(formatter)
        binding.time.text = currentDate

        model= ArrayList()
        model1= ArrayList()

        adapter= onbookingAdapter(model)
        binding.viewpager.adapter = adapter
        binding.viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        binding.dotsIndicator.setViewPager2(binding.viewpager)



     model.add(0,ongoing("1233456","12/02/2000","Manoj"))
     model.add(1,ongoing("1233456","12/02/2000","Manoj"))
     model.add(2,ongoing("1233456","12/02/2000","Manoj"))
     adapter.notifyDataSetChanged()

     adapter1= upcomimgAdapter(model1)
     binding.viewpager1.adapter = adapter1
     binding.viewpager1.orientation = ViewPager2.ORIENTATION_HORIZONTAL
     binding.dotsIndicator1.setViewPager2(binding.viewpager1)


     model1.add(0,ongoing("1233456","12/02/2000","Mano"))
     model1.add(1,ongoing("1233456","12/02/2000","Mano"))
     model1.add(2,ongoing("1233456","12/02/2000","Mano"))
     adapter1.notifyDataSetChanged()

     binding.viewdetail.setOnClickListener{
      startActivity(Intent(activity,bookingdetails::class.java))
     }

        return binding.root

    }
}

