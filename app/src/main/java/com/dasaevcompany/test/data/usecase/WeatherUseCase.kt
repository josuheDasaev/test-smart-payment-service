package com.dasaevcompany.test.data.usecase

import com.dasaevcompany.test.data.network.RetrofitApiClient
import com.dasaevcompany.test.model.Result
import retrofit2.Callback
import retrofit2.Retrofit
import javax.inject.Inject

class WeatherUseCase @Inject constructor(retrofit: Retrofit) {

    private val retrofitService = retrofit.create(RetrofitApiClient::class.java)

    fun getWeather(callBack: Callback<Result>){
        retrofitService.getWeather("524901",
            "b25f9ac8fd554df360c68e66323cdee9").enqueue(callBack)
    }

}