package com.dasaevcompany.test.data.network

import com.dasaevcompany.test.model.Result
import retrofit2.Call
import retrofit2.http.*

interface RetrofitApiClient {

    @GET("forecast?")
    fun getWeather(@Query("id") id : String, @Query("appid") key : String): Call<Result>

}
