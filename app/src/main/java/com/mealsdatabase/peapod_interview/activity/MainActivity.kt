package com.mealsdatabase.peapod_interview.activity // ktlint-disable package-name

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mealsdatabase.peapod_interview.ui.theme.component.showSeaList
import com.mealsdatabase.peapod_interview.viewmodel.SeaFoodViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {

    private val seaFoodViewModel: SeaFoodViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showSeaList(seaFoodViewModel)
        }
    }
}
