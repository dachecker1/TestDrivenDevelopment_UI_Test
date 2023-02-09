package com.vk.testdrivendevelopment_ui_test.app

import android.app.Application
import com.vk.testdrivendevelopment_ui_test.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        if(GlobalContext.getOrNull() == null) {
            startKoin {
                androidContext(this@App)
                modules(appModule)

            }
        }
    }
}