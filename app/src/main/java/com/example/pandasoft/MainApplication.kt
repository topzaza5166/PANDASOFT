package com.example.pandasoft

import android.app.Application
import com.example.pandasoft.di.appModule
import com.example.pandasoft.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(
                listOf(
                    appModule,
                    networkModule
                )
            )
        }
    }

}