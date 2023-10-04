package com.mealsdatabase.peapod_interview.repositry // ktlint-disable package-name

import com.mealsdatabase.peapod_interview.data.SeaFood
import com.mealsdatabase.peapod_interview.network.SeaFoodWebServices
import retrofit2.Response

class SeaFoodRepositry(val seaFoodWebServices: SeaFoodWebServices) {

    suspend fun getSeaFoods(): Response<SeaFood> {
        return seaFoodWebServices.getSeaFoods()
    }
}
