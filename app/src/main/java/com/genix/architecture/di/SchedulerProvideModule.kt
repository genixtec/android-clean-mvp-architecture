package com.genix.architecture.di

import com.genix.architecture.rx.AppSchedulerProvider
import com.genix.architecture.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SchedulerProvideModule {

    @Singleton @Provides
    fun provideSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()
}