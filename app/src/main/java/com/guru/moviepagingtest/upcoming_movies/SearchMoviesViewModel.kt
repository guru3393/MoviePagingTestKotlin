package com.guru.moviepagingtest.upcoming_movies

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import javax.inject.Inject

class SearchMoviesViewModel @Inject constructor(private val config: PagedList.Config) : ViewModel() {
    private var sourceFactory: SearchMoviesDataSourceFactory
    var pagedListLiveData: LiveData<PagedList<SearchMovie>>
    fun replaceSubscription(lifecycleOwner: LifecycleOwner?, searchText: String?) {
        pagedListLiveData.removeObservers(lifecycleOwner!!)
        sourceFactory = searchText?.let { SearchMoviesDataSourceFactory(it) }
                ?: SearchMoviesDataSourceFactory(null)
        pagedListLiveData = LivePagedListBuilder(sourceFactory, config).build()
    }

    init {
        sourceFactory = SearchMoviesDataSourceFactory(null)
        pagedListLiveData = LivePagedListBuilder(sourceFactory, config).build()
    }
}