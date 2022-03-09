package com.dasaevcompany.test.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dasaevcompany.test.databinding.FragmentInfoWeatherBinding
import com.dasaevcompany.test.model.Weather
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class InfoWeatherFragment(weatherFragment: Weather) : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentInfoWeatherBinding
    private val weather = weatherFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoWeatherBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            temp.text = "Temperatura: "+weather.dataWeather.temp.toString()
            tempMin.text = "Temperatura Min: " + weather.dataWeather.tempMin.toString()
            temMaxp.text = "Temperatura Max: "+weather.dataWeather.tempMax.toString()
            pressure.text = "Presión : "+ weather.dataWeather.pressure.toString()
            seaLevel.text = "Nivel del Mar: "+weather.dataWeather.seaLevel.toString()
            humidity.text = "Humedad: "+weather.dataWeather.humidity.toString()
        }

    }


}