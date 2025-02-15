package com.emerson.pokeapp

import android.app.Application
import com.emerson.pokeapp.di.remoteModule
import com.emerson.pokeapp.di.repositoryModule
import com.emerson.pokeapp.di.usecases
import com.emerson.pokeapp.di.viewModels
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PokeApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(androidContext = applicationContext)
            modules(
                viewModels,
                usecases,
                repositoryModule,
                remoteModule
            )
        }
    }
}
