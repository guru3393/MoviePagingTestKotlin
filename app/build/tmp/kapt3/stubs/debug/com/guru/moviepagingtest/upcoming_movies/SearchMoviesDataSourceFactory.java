package com.guru.moviepagingtest.upcoming_movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMovie;", "searchText", "", "(Ljava/lang/String;)V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesDataSource;", "create", "app_debug"})
public final class SearchMoviesDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.guru.moviepagingtest.upcoming_movies.SearchMovie> {
    private final androidx.lifecycle.MutableLiveData<com.guru.moviepagingtest.upcoming_movies.SearchMoviesDataSource> liveData = null;
    private final java.lang.String searchText = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.guru.moviepagingtest.upcoming_movies.SearchMoviesDataSource create() {
        return null;
    }
    
    public SearchMoviesDataSourceFactory(@org.jetbrains.annotations.Nullable()
    java.lang.String searchText) {
        super();
    }
}