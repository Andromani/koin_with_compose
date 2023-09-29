package com.mealsdatabase.peapod_interview.network

import com.mealsdatabase.peapod_interview.data.SeaFood
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SeaFoodApiInterface {

    @GET("filter.php")
    suspend fun getSeaFoods(@Query("c") seaFoodName: String): Response<SeaFood>

}