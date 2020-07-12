package com.guru.moviepagingtest.di.upcoming_movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/guru/moviepagingtest/di/upcoming_movies/SearchMoviesViewModelModule;", "", "()V", "bindApiViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/guru/moviepagingtest/di/ApiViewModelFactory;", "provideUpcomingMoviesViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesViewModel;", "Companion", "app_debug"})
@dagger.Module()
public abstract class SearchMoviesViewModelModule {
    public static final com.guru.moviepagingtest.di.upcoming_movies.SearchMoviesViewModelModule.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindApiViewModelFactory(@org.jetbrains.annotations.Nullable()
    com.guru.moviepagingtest.di.ApiViewModelFactory factory);
    
    @org.jetbrains.annotations.Nullable()
    @com.guru.moviepagingtest.di.ViewModelKey(value = com.guru.moviepagingtest.upcoming_movies.SearchMoviesViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel provideUpcomingMoviesViewModel(@org.jetbrains.annotations.Nullable()
    com.guru.moviepagingtest.upcoming_movies.SearchMoviesViewModel viewModel);
    
    public SearchMoviesViewModelModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/guru/moviepagingtest/di/upcoming_movies/SearchMoviesViewModelModule$Companion;", "", "()V", "providePagedListConfig", "Landroidx/paging/PagedList$Config;", "app_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Provides()
        @javax.inject.Singleton()
        public final androidx.paging.PagedList.Config providePagedListConfig() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}