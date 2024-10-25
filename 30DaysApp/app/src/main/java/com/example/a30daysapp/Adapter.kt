package com.example.a30daysapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val days: List<DataClass>) :
    RecyclerView.Adapter<Adapter.CreativeViewer>() {

    inner class CreativeViewer(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dayTitle: TextView = itemView.findViewById(R.id.dayTitle)
        val cardTitle: TextView = itemView.findViewById(R.id.cardTitle)
        val cardDescription: TextView = itemView.findViewById(R.id.cardDescription)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreativeViewer {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return CreativeViewer(view)
    }

    override fun onBindViewHolder(holder: CreativeViewer, position: Int) {
        val day = days[position]
        holder.dayTitle.text = day.day
        holder.cardTitle.text = day.activity
        holder.cardDescription.text = day.description
        holder.imageView.setImageResource(day.imageResId)
    }

    override fun getItemCount(): Int {
        return days.size
    }
}
