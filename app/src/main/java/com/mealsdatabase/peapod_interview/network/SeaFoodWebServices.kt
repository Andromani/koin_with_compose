package com.mealsdatabase.peapod_interview.network // ktlint-disable package-name

import com.mealsdatabase.peapod_interview.data.SeaFood
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SeaFoodWebServices {
    private val baseURL = "https://www.themealdb.com/api/json/v1/1/"

    private val seaFoodApiInterface by lazy {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

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
