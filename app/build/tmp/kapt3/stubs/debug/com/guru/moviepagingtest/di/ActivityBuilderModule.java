package com.guru.moviepagingtest.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\'J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/guru/moviepagingtest/di/ActivityBuilderModule;", "", "()V", "contributeMovieDetailsActivity", "Lcom/guru/moviepagingtest/movie_details/MovieDetailsActivity;", "contributeUpcomingMoviesActivity", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesActivity;", "app_debug"})
@dagger.Module()
public abstract class ActivityBuilderModule {
    
    @org.jetbrains.annotations.Nullable()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.guru.moviepagingtest.upcoming_movies.SearchMoviesActivity contributeUpcomingMoviesActivity();
    
    @org.jetbrains.annotations.Nullable()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.guru.moviepagingtest.movie_details.MovieDetailsActivity contributeMovieDetailsActivity();
    
    public ActivityBuilderModule() {
        super();
    }
}