package com.example.realtimeweather.api

// T represents weatherModel
sealed class NetworkResponse<out T> {
    data class Success<out T>(val data: T) : NetworkResponse<T>()
    data class Error(val exception: String) : NetworkResponse<Nothing>()
    object Loading : NetworkResponse<Nothing>()
}