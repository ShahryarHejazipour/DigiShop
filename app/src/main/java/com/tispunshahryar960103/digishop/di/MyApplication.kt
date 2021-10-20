package com.tispunshahryar960103.digishop.di

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MyApplication : Application() {


    companion object {

        lateinit var appContext: Application

        fun getMyappContext(): Context {
            return appContext.applicationContext
        }


    }


    override fun onCreate() {
        super.onCreate()
        appContext = this


    }


}





