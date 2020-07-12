package com.guru.moviepagingtest.upcoming_movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesApiResponse;", "", "()V", "Response", "", "getResponse", "()Ljava/lang/String;", "setResponse", "(Ljava/lang/String;)V", "searchMovies", "", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMovie;", "getSearchMovies", "()Ljava/util/List;", "setSearchMovies", "(Ljava/util/List;)V", "totalPages", "", "getTotalPages", "()I", "setTotalPages", "(I)V", "app_debug"})
public final class SearchMoviesApiResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Search")
    private java.util.List<com.guru.moviepagingtest.upcoming_movies.SearchMovie> searchMovies;
    @com.google.gson.annotations.SerializedName(value = "totalResults")
    private int totalPages = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Response")
    private java.lang.String Response;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.guru.moviepagingtest.upcoming_movies.SearchMovie> getSearchMovies() {
        return null;
    }
    
    public final void setSearchMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.guru.moviepagingtest.upcoming_movies.SearchMovie> p0) {
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final void setTotalPages(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public SearchMoviesApiResponse() {
        super();
    }
}