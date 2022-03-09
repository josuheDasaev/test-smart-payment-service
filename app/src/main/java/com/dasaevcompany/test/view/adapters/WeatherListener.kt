package com.dasaevcompany.test.view.adapters


import com.dasaevcompany.test.model.Weather

interface WeatherListener {
    fun clickOnWeather(weather: Weather)
}