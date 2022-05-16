package com.example.kotlinrecyclerview.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerview.R
import com.example.kotlinrecyclerview.models.Weather

class WeatherAdapter(private val weatherData: List<Weather>) : RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val temperatureTextView: TextView
        val cityTextView: TextView
        val dateTextView: TextView

        init {
            temperatureTextView = view.findViewById(R.id.temperature_tv)
            cityTextView = view.findViewById(R.id.city_tv)
            dateTextView = view.findViewById(R.id.date_tv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.weather_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.temperatureTextView.text = weatherData[position].temp
        holder.cityTextView.text = weatherData[position].city
        holder.dateTextView.text = weatherData[position].date
    }

    override fun getItemCount(): Int {
        return weatherData.size
    }
}