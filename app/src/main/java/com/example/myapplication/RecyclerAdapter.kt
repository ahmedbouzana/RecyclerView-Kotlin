package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.row_friend, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount()= 25

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

    }

}
