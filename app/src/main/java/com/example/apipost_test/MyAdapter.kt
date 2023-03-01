package com.example.apipost_test

import android.view.View
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

class MyAdapter(private val dataList: List<ItemData>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemData = dataList[position]

        holder.idTextView.text = itemData.id.toString()
        holder.nameTextView.text = itemData.name
        holder.descriptionTextView.text = itemData.description
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val idTextView: TextView = itemView.findViewById(R.id.title_textview)
        val nameTextView: TextView = itemView.findViewById(R.id.body_textview)
        val descriptionTextView: TextView = itemView.findViewById(R.id.auther_textview)
    }
}
