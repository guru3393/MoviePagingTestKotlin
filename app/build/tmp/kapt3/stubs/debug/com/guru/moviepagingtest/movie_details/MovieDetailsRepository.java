package com.guru.moviepagingtest.movie_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/guru/moviepagingtest/movie_details/MovieDetailsRepository;", "", "api", "Lcom/guru/moviepagingtest/network/TheMovieDbApi;", "(Lcom/guru/moviepagingtest/network/TheMovieDbApi;)V", "addMovieDetailsToLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/guru/moviepagingtest/movie_details/MovieDetails;", "movieId", "", "app_debug"})
@javax.inject.Singleton()
public final class MovieDetailsRepository {
    private final com.guru.moviepagingtest.network.TheMovieDbApi api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.guru.moviepagingtest.movie_details.MovieDetails> addMovieDetailsToLiveData(@org.jetbrains.annotations.Nullable()
    java.lang.String movieId) {
        return null;
    }
    
    @javax.inject.Inject()
    public MovieDetailsRepository(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.network.TheMovieDbApi api) {
        super();
    }
}