package com.dasaevcompany.test.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Weather:Serializable {

    @SerializedName("dt")  var dt : Int = 0
    @SerializedName("dt_txt")  var date : String = ""
    @SerializedName("main")  var dataWeather = DataWeather()
}