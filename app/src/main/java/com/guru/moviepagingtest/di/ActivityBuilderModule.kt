package com.guru.moviepagingtest.di

import com.guru.moviepagingtest.movie_details.MovieDetailsActivity
import com.guru.moviepagingtest.upcoming_movies.SearchMoviesActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeUpcomingMoviesActivity(): SearchMoviesActivity?

    @ContributesAndroidInjector
    abstract fun contributeMovieDetailsActivity(): MovieDetailsActivity?
}