package com.mealsdatabase.peapod_interview.network

import com.mealsdatabase.peapod_interview.data.SeaFood
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SeaFoodWebServices {
    private val baseURL = "https://www.themealdb.com/api/json/v1/1/"

    private val seaFoodApiInterface by lazy {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val httpClient = OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build()

        Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SeaFoodApiInterface::class.java)
    }

    suspend fun getSeaFoods(): Response<SeaFood> {
        return seaFoodApiInterface.getSeaFoods("Seafood")
    }
}