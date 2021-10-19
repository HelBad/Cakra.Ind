package com.example.edukasianak.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.edukasianak.R

class HomeAdapter (val viewPager: ViewPager2, val imgList: ArrayList<HomeItem>):
RecyclerView.Adapter<HomeAdapter.SliderViewHolder>() {
    inner class SliderViewHolder(v: View): RecyclerView.ViewHolder(v) {
        val img = v.findViewById<ImageView>(R.id.imageSlider)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.acc_home, parent, false)
        return SliderViewHolder(v)
    }

    override fun getItemCount(): Int = imgList.size

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        val listImg = imgList[position]
        holder.img.setImageResource(listImg.img)
    }
}