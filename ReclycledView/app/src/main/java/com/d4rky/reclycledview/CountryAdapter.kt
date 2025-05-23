package com.d4rky.reclycledview
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountryAdapter(private val countryList: ArrayList<CountryModel>) : RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        val countryName = itemView.findViewById<TextView>(R.id.country_name_iv)
        val countryImage = itemView.findViewById<CircleImageView>(R.id.country_flag_iv)

    }

    //Constructores
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.countries,parent,false))
    }

    override fun onBindViewHolder(holder: CountryAdapter.ViewHolder, position: Int) {
        val country = countryList[position]

        holder.countryName.text = country.countryName
        holder.countryImage.setImageResource(country.countryImage)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }
}