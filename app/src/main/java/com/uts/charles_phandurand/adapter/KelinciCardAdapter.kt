package com.uts.charles_phandurand.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uts.charles_phandurand.R
import com.uts.charles_phandurand.data.DataSource

class KelinciCardAdapter :

 RecyclerView.Adapter<KelinciCardAdapter.KelinciCardViewHolder>() {
    private val kelinciList = DataSource.kelincis

    class KelinciCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val kelinciImageView : ImageView? = view?.findViewById(R.id.kelinci_img)
        val kelinciNameText : TextView? = view?.findViewById(R.id.kelinci_name)
        val kelinciAgeText : TextView? = view?.findViewById(R.id.kelinci_age)
        val kelinciHobbyText : TextView? = view?.findViewById(R.id.kelinci_hobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KelinciCardViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.vertical_grid_list_item, parent, false)
        return KelinciCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return kelinciList.size
    }

    override fun onBindViewHolder(holder: KelinciCardViewHolder, position: Int) {
        val kelinciData = kelinciList[position]
        holder.kelinciImageView?.setImageResource(kelinciData.imageResourceId)
        holder.kelinciNameText?.text = kelinciData.name
        holder.kelinciAgeText?.text = kelinciData.age
        holder.kelinciHobbyText?.text = kelinciData.hobbies
    }
}
