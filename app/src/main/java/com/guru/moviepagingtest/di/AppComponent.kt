package com.guru.moviepagingtest.di

import android.app.Application
import com.guru.moviepagingtest.BaseApplication
import com.guru.moviepagingtest.di.movie_details.MovieDetailsViewModelModule
import com.guru.moviepagingtest.di.movie_details.PlayViewModelModule
import com.guru.moviepagingtest.di.upcoming_movies.SearchMoviesViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, ActivityBuilderModule::class, SearchMoviesViewModelModule::class, MovieDetailsViewModelModule::class, PlayViewModelModule::class])
interface AppComponent : AndroidInjector<BaseApplication?> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application?): Builder?
        fun build(): AppComponent?
    }
}