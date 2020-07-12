package com.guru.moviepagingtest.di.movie_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.guru.moviepagingtest.di.ApiViewModelFactory
import com.guru.moviepagingtest.di.ViewModelKey
import com.guru.moviepagingtest.movie_details.MovieDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MovieDetailsViewModelModule {
    @Binds
    abstract fun bindMovieDetailsViewModelFactory(factory: ApiViewModelFactory?): ViewModelProvider.Factory?

    @Binds
    @IntoMap
    @ViewModelKey(MovieDetailsViewModel::class)
    abstract fun provideMovieDetailsViewModel(viewModel: MovieDetailsViewModel?): ViewModel?
}