package com.example.cerego.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cerego.R
import com.squareup.picasso.Picasso

class Adapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var listdata :List<com.example.cerego.Set> = ArrayList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.word_items,parent, false) )

    }

    override fun getItemCount(): Int {
        return listdata.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        listdata.get(position).let { ( holder as MyViewHolder).bind(it) }

    }

    fun setCampaignList(list: List<com.example.cerego.Set?>){
        listdata = list  as ArrayList<com.example.cerego.Set>
        notifyDataSetChanged()
    }

   class  MyViewHolder(view: View): RecyclerView.ViewHolder(view){
       var title : TextView = itemView.findViewById(R.id.title)
       var image : ImageView = itemView.findViewById(R.id.imageView)

       fun bind(dataset: com.example.cerego.Set){
           title.text = dataset.name
           Picasso.get()
               .load(dataset.image?.url)
               .into(image)



       }



    }
}