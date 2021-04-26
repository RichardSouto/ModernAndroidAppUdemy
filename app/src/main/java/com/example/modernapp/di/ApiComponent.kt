package com.example.modernapp.di

import com.example.modernapp.model.CountriesService
import dagger.Component

@Component(modules=[ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)
}