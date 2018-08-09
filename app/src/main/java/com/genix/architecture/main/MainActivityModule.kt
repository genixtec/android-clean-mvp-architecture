package com.genix.architecture.main

import com.genix.architecture.ApiService
import com.genix.architecture.rx.SchedulerProvider
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides fun provideMainView(mainActivity: MainActivity): MainView {
        return mainActivity
    }

    @Provides fun provideMainPresenter(mainView: MainView,
                                       apiService: ApiService,
                                       schedulerProvider: SchedulerProvider): MainPresenter {
        return MainPresenterImpl(mainView, apiService, schedulerProvider)
    }
}