package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerview.adapters.WeatherAdapter
import com.example.kotlinrecyclerview.models.Weather

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val data = ArrayList<Weather>()
        data.add(Weather("72.2","Purwokerto", "22/12/2022"))
        data.add(Weather("52.2","Cilacap", "22/12/2022"))
        val adapter = WeatherAdapter(data)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}