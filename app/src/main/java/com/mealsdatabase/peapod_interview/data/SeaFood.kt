package com.mealsdatabase.peapod_interview.data // ktlint-disable package-name

import kotlinx.serialization.SerialName

data class SeaFood(
    @SerialName("meals")
    val meals: List<Meal>,
)
