package com.guru.moviepagingtest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c1\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/guru/moviepagingtest/di/AppModule;", "", "()V", "provideGlideInstance", "Lcom/bumptech/glide/RequestManager;", "application", "Landroid/app/Application;", "provideRetrofitInstance", "Lretrofit2/Retrofit;", "provideTheMovieDbApi", "Lcom/guru/moviepagingtest/network/TheMovieDbApi;", "retrofit", "app_debug"})
@dagger.Module()
public final class AppModule {
    public static final com.guru.moviepagingtest.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofitInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.guru.moviepagingtest.network.TheMovieDbApi provideTheMovieDbApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.bumptech.glide.RequestManager provideGlideInstance(@org.jetbrains.annotations.Nullable()
    android.app.Application application) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}