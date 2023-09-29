package com.mealsdatabase.peapod_interview.data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SeaFood(
    @SerialName("meals")
    val meals: List<Meal>
)