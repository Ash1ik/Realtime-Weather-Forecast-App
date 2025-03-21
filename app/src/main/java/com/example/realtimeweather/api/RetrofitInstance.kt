package com.example.realtimeweather.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitInstance {

    private const val BASEURL = "http://api.weatherapi.com"

    private fun getInstance(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASEURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val weatherApi =  getInstance().create(WeatherApi::class.java)

}