package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

//获取全局context
class SunnyWeatherApplication:Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "IzRbtSnbCGGfS3d8"
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}