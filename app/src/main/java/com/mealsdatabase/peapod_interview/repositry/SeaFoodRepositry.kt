package com.mealsdatabase.peapod_interview.repositry

import com.mealsdatabase.peapod_interview.data.SeaFood
import com.mealsdatabase.peapod_interview.network.SeaFoodWebServices
import retrofit2.Response

class SeaFoodRepositry(val seaFoodWebServices: SeaFoodWebServices) {

    suspend fun getSeaFoods(): Response<SeaFood> {
        return seaFoodWebServices.getSeaFoods()
    }
}