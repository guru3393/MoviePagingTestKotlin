package com.guru.moviepagingtest.di.movie_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/guru/moviepagingtest/di/movie_details/MovieDetailsViewModelModule;", "", "()V", "bindMovieDetailsViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/guru/moviepagingtest/di/ApiViewModelFactory;", "provideMovieDetailsViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/guru/moviepagingtest/movie_details/MovieDetailsViewModel;", "app_debug"})
@dagger.Module()
public abstract class MovieDetailsViewModelModule {
    
    @org.jetbrains.annotations.Nullable()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindMovieDetailsViewModelFactory(@org.jetbrains.annotations.Nullable()
    com.guru.moviepagingtest.di.ApiViewModelFactory factory);
    
    @org.jetbrains.annotations.Nullable()
    @com.guru.moviepagingtest.di.ViewModelKey(value = com.guru.moviepagingtest.movie_details.MovieDetailsViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel provideMovieDetailsViewModel(@org.jetbrains.annotations.Nullable()
    com.guru.moviepagingtest.movie_details.MovieDetailsViewModel viewModel);
    
    public MovieDetailsViewModelModule() {
        super();
    }
}