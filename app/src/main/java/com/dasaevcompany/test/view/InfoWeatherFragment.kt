package com.dasaevcompany.test.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dasaevcompany.test.R
import com.dasaevcompany.test.databinding.ActivityMainBinding

class InfoWeatherFragment : Fragment() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_weather, container, false)
    }


}