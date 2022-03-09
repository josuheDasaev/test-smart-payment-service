package com.dasaevcompany.test.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DataWeather: Serializable {

    @SerializedName("temp")  var temp : Float = 0f
    @SerializedName("temp_min")  var tempMin : Float = 0f
    @SerializedName("temp_max")  var tempMax : Float = 0f
    @SerializedName("pressure")  var pressure : Float = 0f
    @SerializedName("sea_level")  var seaLevel : Float = 0f
    @SerializedName("humidity")  var humidity : Float = 0f
}