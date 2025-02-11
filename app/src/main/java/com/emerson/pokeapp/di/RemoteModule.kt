package com.emerson.pokeapp.di

import com.emerson.pokeapp.data.remote.PokeApi
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val remoteModule
    get() = module {
        single { pokeApi }
    }


private val httpClient
    get() = OkHttpClient.Builder()
        .callTimeout(30L, TimeUnit.SECONDS)
        .build()

private val retrofit
    get() =
        Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient)
            .baseUrl("https://pokeapi.co/api/v2/")
            .build()

private val pokeApi get() = retrofit.create(PokeApi::class.java)