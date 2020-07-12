package com.guru.moviepagingtest

import com.guru.moviepagingtest.di.AppComponent
import com.guru.moviepagingtest.di.DaggerAppComponent
import dagger.android.support.DaggerApplication

class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AppComponent? {
        return DaggerAppComponent.builder()
                .application(this)
                .build()
    }
}