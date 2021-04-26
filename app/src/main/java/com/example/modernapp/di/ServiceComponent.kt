package com.example.modernapp.di

import com.example.modernapp.viewmodel.ListViewModel
import dagger.Component

@Component(modules=[ServiceModule::class])
interface ServiceComponent {

    fun inject(listViewModel: ListViewModel)
}