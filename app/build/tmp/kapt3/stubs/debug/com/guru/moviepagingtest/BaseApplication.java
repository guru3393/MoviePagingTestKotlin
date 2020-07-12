package com.guru.moviepagingtest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0014\u00a8\u0006\u0005"}, d2 = {"Lcom/guru/moviepagingtest/BaseApplication;", "Ldagger/android/support/DaggerApplication;", "()V", "applicationInjector", "Lcom/guru/moviepagingtest/di/AppComponent;", "app_debug"})
public final class BaseApplication extends dagger.android.support.DaggerApplication {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected com.guru.moviepagingtest.di.AppComponent applicationInjector() {
        return null;
    }
    
    public BaseApplication() {
        super();
    }
}