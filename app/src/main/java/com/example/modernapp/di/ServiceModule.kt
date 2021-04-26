package com.example.modernapp.di

import com.example.modernapp.model.CountriesService
import dagger.Module
import dagger.Provides

@Module
class ServiceModule {

    @Provides
    fun provideServiceModule(): CountriesService = CountriesService()
}