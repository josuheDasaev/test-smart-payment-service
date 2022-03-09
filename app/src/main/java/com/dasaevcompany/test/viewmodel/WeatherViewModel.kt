package com.dasaevcompany.test.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dasaevcompany.test.data.usecase.WeatherUseCase
import com.dasaevcompany.test.model.Result
import com.dasaevcompany.test.model.Weather
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val service: WeatherUseCase
): ViewModel() {

    var listWeather =  MutableLiveData<List<Weather>>()

    var isLoading = MutableLiveData<Boolean>()
    var isFailed = MutableLiveData<Boolean>()


    fun getWeather(){
        viewModelScope.launch {
            service.getWeather(object : Callback<Result> {
                override fun onResponse(call: Call<Result>, response: Response<Result>) {
                    val data = response.body()
                    val list = data?.results
                    listWeather.postValue(list!!)
                    processFinished(false)
                }
                override fun onFailure(call: Call<Result>, t: Throwable) {
                    processFinished(true)
                }
            })
        }
    }

    fun processFinished(failed : Boolean){
        isLoading.value = false
        isFailed.value = failed
    }
}