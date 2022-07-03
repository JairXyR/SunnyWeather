package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application(){
    companion object{
        const val TOKEN = "4E1KxlltQCcBUJ28"   //彩云天气API令牌值
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context   //全局获取Context的方式
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}