package com.example.romsfinal

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TownsAdapter(): RecyclerView.Adapter<TownsAdapter.MyViewHolder>() {
    class MyViewHolder internal constructor(itemView: View) :RecyclerView.ViewHolder(itemView){
        val townName: TextView =itemView.findViewById(R.id.townName)
        val townTopAttraction:TextView=itemView.findViewById(R.id.townTopAttraction)
        val townTopFood:TextView=itemView.findViewById(R.id.food)
        val townCategory:TextView=itemView.findViewById(R.id.category)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.cell_layout, parent, false) as View
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val town=Repository.places[position]
        holder.townName.text=town.name
        holder.townTopAttraction.text=town.topAttraction
        holder.townTopFood.text=town.topFood
        holder.townCategory.text=town.category

        val context=holder.itemView.context
        holder.itemView.setOnClickListener{
            val intent= Intent(context, EditTownActivity::class.java).apply{
                putExtra("position", position)
                putExtra("name", town.name)
                putExtra("topAttraction", town.topAttraction)
                putExtra("topFood", town.topFood)
                putExtra("category", town.category)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return Repository.places.size
    }
}