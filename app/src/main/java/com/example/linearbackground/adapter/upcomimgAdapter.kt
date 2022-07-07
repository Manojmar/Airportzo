package com.example.linearbackground.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.linearbackground.Model.ongoing
import com.example.linearbackground.databinding.ActivityCardBinding
import com.example.linearbackground.databinding.ActivitySmpcardBinding

class upcomimgAdapter(var list:ArrayList<ongoing>): RecyclerView.Adapter<onbookingAdapter.ViewHolder>() {
    class ViewHolder(val cardBinding: ActivityCardBinding):RecyclerView.ViewHolder(cardBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): onbookingAdapter.ViewHolder {
        return onbookingAdapter.ViewHolder(
            ActivityCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: onbookingAdapter.ViewHolder, position: Int) {
        val out=list[position]
        holder.cardBinding.one.text=out.orderid
        holder.cardBinding.four.text=out.customer
        holder.cardBinding.service.text=out.servicedate
        holder.cardBinding.cardlayout.setBackgroundColor(Color.parseColor("#f2f4f7"))

    }

    override fun getItemCount(): Int {
        return list.size
    }
}