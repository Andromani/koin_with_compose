package com.mealsdatabase.peapod_interview.module // ktlint-disable package-name

import com.mealsdatabase.peapod_interview.network.SeaFoodWebServices
import com.mealsdatabase.peapod_interview.repositry.SeaFoodRepositry
import com.mealsdatabase.peapod_interview.viewmodel.SeaFoodViewModel
import org.koin.dsl.module

val seadFoodModule = module {
    single { SeaFoodRepositry(SeaFoodWebServices()) }
    factory { SeaFoodViewModel(get()) }
}
