package com.guru.moviepagingtest.upcoming_movies

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource

class SearchMoviesDataSourceFactory internal constructor(private val searchText: String?) : DataSource.Factory<Int, SearchMovie>() {
    private val liveData = MutableLiveData<SearchMoviesDataSource>()
    override fun create(): SearchMoviesDataSource {
        val searchMoviesDataSource = SearchMoviesDataSource(searchText)
        liveData.postValue(searchMoviesDataSource)
        return searchMoviesDataSource
    }

}