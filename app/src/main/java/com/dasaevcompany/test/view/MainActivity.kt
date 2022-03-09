package com.dasaevcompany.test.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.dasaevcompany.test.R
import com.dasaevcompany.test.databinding.ActivityMainBinding
import com.dasaevcompany.test.model.Weather
import com.dasaevcompany.test.view.adapters.WeatherAdapter
import com.dasaevcompany.test.view.adapters.WeatherListener
import com.dasaevcompany.test.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), WeatherListener {

    private lateinit var binding: ActivityMainBinding
    private val service : WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        service.getWeather()


        service.listWeather.observe(this){
            if (it.isNotEmpty()){
                val adapter = WeatherAdapter(it, this)
                binding.recycler.adapter = adapter
            }
        }
    }

    override fun clickOnWeather(weather: Weather) {

    }
}