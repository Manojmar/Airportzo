package com.example.linearbackground.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.linearbackground.Model.ongoing
import com.example.linearbackground.databinding.ActivityCardBinding
import com.example.linearbackground.databinding.ActivitySmpcardBinding
import com.example.linearbackground.sample

class onbookingAdapter(var list:ArrayList<ongoing>):RecyclerView.Adapter<onbookingAdapter.ViewHolder>(){
    class ViewHolder(val cardBinding: ActivityCardBinding):RecyclerView.ViewHolder(cardBinding.root) {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(ActivityCardBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val out=list[position]
        holder.cardBinding.one.text=out.orderid
        holder.cardBinding.four.text=out.customer
        holder.cardBinding.service.text=out.servicedate

            holder.cardBinding.textView4.setOnClickListener {
            holder.itemView.context.startActivity(Intent(holder.itemView.context, sample::class.java))
            }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
