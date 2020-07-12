package com.guru.moviepagingtest.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'J@\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006H\'J@\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00032\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006H\'J*\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/guru/moviepagingtest/network/TheMovieDbApi;", "", "getMovieDetails", "Lretrofit2/Call;", "Lcom/guru/moviepagingtest/movie_details/MovieDetails;", "id", "", "apiKey", "getMovies", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesApiResponse;", "page", "", "Marvel", "type", "getSearchedMovies", "query", "getTrailers", "Lcom/guru/moviepagingtest/movie_details/play/TrailersApiResponse;", "app_debug"})
public abstract interface TheMovieDbApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = ".")
    public abstract retrofit2.Call<com.guru.moviepagingtest.upcoming_movies.SearchMoviesApiResponse> getMovies(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "s")
    java.lang.String Marvel, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = ".")
    public abstract retrofit2.Call<com.guru.moviepagingtest.upcoming_movies.SearchMoviesApiResponse> getSearchedMovies(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "s")
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "type")
    java.lang.String type);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = ".")
    public abstract retrofit2.Call<com.guru.moviepagingtest.movie_details.MovieDetails> getMovieDetails(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "i")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/{movie_id}/videos")
    public abstract retrofit2.Call<com.guru.moviepagingtest.movie_details.play.TrailersApiResponse> getTrailers(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Path(value = "i")
    java.lang.String id, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "apikey")
    java.lang.String apiKey);
}