package com.guru.moviepagingtest.di.upcoming_movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.paging.PagedList
import com.guru.moviepagingtest.di.ApiViewModelFactory
import com.guru.moviepagingtest.di.ViewModelKey
import com.guru.moviepagingtest.upcoming_movies.SearchMoviesViewModel
import com.guru.moviepagingtest.utils.Constants
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class SearchMoviesViewModelModule {
    @Binds
    abstract fun bindApiViewModelFactory(factory: ApiViewModelFactory?): ViewModelProvider.Factory?

    @Binds
    @IntoMap
    @ViewModelKey(SearchMoviesViewModel::class)
    abstract fun provideUpcomingMoviesViewModel(viewModel: SearchMoviesViewModel?): ViewModel?
    @Module
    companion object {
        @Singleton
        @Provides
        fun providePagedListConfig(): PagedList.Config {
            return PagedList.Config.Builder()
                    .setEnablePlaceholders(false)
                    .setPageSize(Constants.ITEMS_PER_PAGE)
                    .build()
        }
    }
}