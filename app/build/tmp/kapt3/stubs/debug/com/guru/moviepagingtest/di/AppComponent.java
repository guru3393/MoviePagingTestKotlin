package com.guru.moviepagingtest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/guru/moviepagingtest/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/guru/moviepagingtest/BaseApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.guru.moviepagingtest.di.AppModule.class, com.guru.moviepagingtest.di.ActivityBuilderModule.class, com.guru.moviepagingtest.di.upcoming_movies.SearchMoviesViewModelModule.class, com.guru.moviepagingtest.di.movie_details.MovieDetailsViewModelModule.class, com.guru.moviepagingtest.di.movie_details.PlayViewModelModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.guru.moviepagingtest.BaseApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\'J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/guru/moviepagingtest/di/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/guru/moviepagingtest/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.Nullable()
        @dagger.BindsInstance()
        public abstract com.guru.moviepagingtest.di.AppComponent.Builder application(@org.jetbrains.annotations.Nullable()
        android.app.Application application);
        
        @org.jetbrains.annotations.Nullable()
        public abstract com.guru.moviepagingtest.di.AppComponent build();
    }
}