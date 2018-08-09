package com.genix.architecture.main

import com.genix.architecture.ApiService
import com.genix.architecture.rx.SchedulerProvider

class MainInteractorImpl(private val apiService: ApiService,
                         private val schedulerProvider: SchedulerProvider) : MainInteractor {

    override fun onLoadView(onFinishedListener: MainInteractor.OnFinishedListener) {
        apiService.getPosts()
                .subscribeOn(schedulerProvider.io())
                .observeOn(schedulerProvider.ui())
                .subscribe(onFinishedListener::onFinishLoadView)
    }
}