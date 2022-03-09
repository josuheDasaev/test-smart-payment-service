package com.dasaevcompany.test.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dasaevcompany.test.R
import com.dasaevcompany.test.databinding.ViewWeatherBinding
import com.dasaevcompany.test.model.Weather

class WeatherAdapter (
    private val list: List<Weather>,
    private val listener: WeatherListener
) :
    RecyclerView.Adapter<WeatherAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.view_weather,parent,false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.createView(item)
        holder.click(item,listener)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class ViewHolder(view: View): RecyclerView.ViewHolder(view){

        private val binding = ViewWeatherBinding.bind(view)

        fun createView(weather: Weather) {
            binding.apply {
                txData1.text = "Fecha:"
                txData2.text = weather.date
            }
        }

        fun click(weather: Weather, listener: WeatherListener){
            binding.item.setOnClickListener {
                listener.clickOnWeather(weather)
            }
        }

    }
}