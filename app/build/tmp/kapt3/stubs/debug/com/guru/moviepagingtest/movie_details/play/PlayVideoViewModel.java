package com.guru.moviepagingtest.movie_details.play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/guru/moviepagingtest/movie_details/play/PlayVideoViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/guru/moviepagingtest/movie_details/play/PlayRepository;", "(Lcom/guru/moviepagingtest/movie_details/play/PlayRepository;)V", "trailersLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/guru/moviepagingtest/movie_details/play/TrailersApiResponse;", "getTrailersLiveData", "()Landroidx/lifecycle/LiveData;", "setTrailersLiveData", "(Landroidx/lifecycle/LiveData;)V", "setMovieId", "", "movieId", "", "app_debug"})
public final class PlayVideoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<com.guru.moviepagingtest.movie_details.play.TrailersApiResponse> trailersLiveData;
    private final com.guru.moviepagingtest.movie_details.play.PlayRepository repository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<com.guru.moviepagingtest.movie_details.play.TrailersApiResponse> getTrailersLiveData() {
        return null;
    }
    
    public final void setTrailersLiveData(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<com.guru.moviepagingtest.movie_details.play.TrailersApiResponse> p0) {
    }
    
    public final void setMovieId(@org.jetbrains.annotations.Nullable()
    java.lang.String movieId) {
    }
    
    @javax.inject.Inject()
    public PlayVideoViewModel(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.movie_details.play.PlayRepository repository) {
        super();
    }
}