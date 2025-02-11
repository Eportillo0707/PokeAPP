package com.emerson.pokeapp

import android.app.Application
import com.emerson.pokeapp.di.remoteModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class PokeApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(androidContext = applicationContext)
            modules(
                remoteModule,
            )
        }
    }
}