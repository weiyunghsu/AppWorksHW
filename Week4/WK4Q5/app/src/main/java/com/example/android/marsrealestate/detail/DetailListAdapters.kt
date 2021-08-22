package com.example.android.marsrealestate.detail

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.marsrealestate.R
import kotlinx.android.synthetic.main.fragment_detail.view.*

class DetailListAdapters : RecyclerView.Adapter<DetailListAdapters.DetailViewHolder>() {
    var detailList = listOf<ClipData.Item>()
    class DetailViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val selectedProperty = itemView.main_photo_image
        val displayPropertyPrice = itemView.price_value_text
        val displayPropertyType = itemView.property_type_text
        fun bind(item: ClipData.Item){
            selectedProperty.setImageResource(itemView.main_photo_image)
            displayPropertyPrice.text= itemView.price_value_text.toString()
            displayPropertyType.text= itemView.property_type_text.toString()
        }
    }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):DetailViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val listViewItem = inflater.inflate(R.layout.fragment_detail, parent, false)
            return DetailViewHolder(listViewItem)
        }
        override fun getItemCount() = detailList.size
        override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
            holder.bind(detailList[position])
        }
       fun updateList(list:ArrayList<Movement>){
            detailList = list
}