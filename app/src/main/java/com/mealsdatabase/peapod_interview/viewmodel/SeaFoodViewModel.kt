package com.mealsdatabase.peapod_interview.viewmodel // ktlint-disable package-name

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mealsdatabase.peapod_interview.data.Meal
import com.mealsdatabase.peapod_interview.repositry.SeaFoodRepositry
import kotlinx.coroutines.launch

class SeaFoodViewModel(private val seaFoodRepositry: SeaFoodRepositry) : ViewModel() {

    val seaFoodList: MutableState<List<Meal>> = mutableStateOf(emptyList())

    init {
        viewModelScope.launch {
            val seaFoods = seaFoodRepositry.getSeaFoods()
            if (seaFoods.isSuccessful) {
                seaFoods.body()?.let {
                    Log.d("SeaFood", "viewModelScope - Meal List size is ${it.meals.size}")
                    seaFoodList.value = it.meals
                }
            }
        }
    }
}
