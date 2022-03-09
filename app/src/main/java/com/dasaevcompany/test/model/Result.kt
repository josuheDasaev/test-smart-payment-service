package com.dasaevcompany.test.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Result:Serializable {
    @SerializedName("list")  var results = listOf<Weather>()
}