package com.guru.moviepagingtest.upcoming_movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "config", "Landroidx/paging/PagedList$Config;", "(Landroidx/paging/PagedList$Config;)V", "pagedListLiveData", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMovie;", "getPagedListLiveData", "()Landroidx/lifecycle/LiveData;", "setPagedListLiveData", "(Landroidx/lifecycle/LiveData;)V", "sourceFactory", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesDataSourceFactory;", "replaceSubscription", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "searchText", "", "app_debug"})
public final class SearchMoviesViewModel extends androidx.lifecycle.ViewModel {
    private com.guru.moviepagingtest.upcoming_movies.SearchMoviesDataSourceFactory sourceFactory;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.guru.moviepagingtest.upcoming_movies.SearchMovie>> pagedListLiveData;
    private final androidx.paging.PagedList.Config config = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.guru.moviepagingtest.upcoming_movies.SearchMovie>> getPagedListLiveData() {
        return null;
    }
    
    public final void setPagedListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.guru.moviepagingtest.upcoming_movies.SearchMovie>> p0) {
    }
    
    public final void replaceSubscription(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.Nullable()
    java.lang.String searchText) {
    }
    
    @javax.inject.Inject()
    public SearchMoviesViewModel(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagedList.Config config) {
        super();
    }
}