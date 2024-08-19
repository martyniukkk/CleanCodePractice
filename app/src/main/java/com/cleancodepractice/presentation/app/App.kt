package com.cleancodepractice.presentation.app

import android.app.Application
import com.cleancodepractice.presentation.di.appModule
import com.cleancodepractice.presentation.di.dataModule
import com.cleancodepractice.presentation.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, domainModule, dataModule))
        }
    }
}