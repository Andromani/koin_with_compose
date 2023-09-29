package com.mealsdatabase.peapod_interview

import android.app.Application
import com.mealsdatabase.peapod_interview.module.seadFoodModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SeaFoodApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@SeaFoodApplication)
            modules(seadFoodModule)
        }
    }
}