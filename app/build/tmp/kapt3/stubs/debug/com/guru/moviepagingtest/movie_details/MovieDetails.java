package com.guru.moviepagingtest.movie_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b+\u0018\u00002\u00020\u0001B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0000J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0000J\u0010\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0000J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0000J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0000J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0000J\u0010\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0000J\u0010\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0000R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR \u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR \u0010\'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\b\u00a8\u0006/"}, d2 = {"Lcom/guru/moviepagingtest/movie_details/MovieDetails;", "", "()V", "actors", "", "getActors", "()Ljava/lang/String;", "setActors", "(Ljava/lang/String;)V", "director", "getDirector", "setDirector", "id", "getId", "setId", "imdbRating", "getImdbRating", "setImdbRating", "language", "getLanguage", "setLanguage", "overview", "getOverview", "setOverview", "posterPath", "getPosterPath", "setPosterPath", "releaseDate", "getReleaseDate", "setReleaseDate", "time", "getTime", "setTime", "title", "getTitle", "setTitle", "writer", "getWriter", "setWriter", "year", "getYear", "setYear", "movieDetails", "getGenres", "getRating", "getTitleAndReleaseDate", "getWriters", "app_debug"})
public final class MovieDetails {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "imdbID")
    private java.lang.String id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Language")
    private java.lang.String language;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Plot")
    private java.lang.String overview;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Released")
    private java.lang.String releaseDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Poster")
    private java.lang.String posterPath;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Runtime")
    private java.lang.String time;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Year")
    private java.lang.String year;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "imdbRating")
    private java.lang.String imdbRating;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Director")
    private java.lang.String director;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Writer")
    private java.lang.String writer;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Actors")
    private java.lang.String actors;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYear() {
        return null;
    }
    
    public final void setYear(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImdbRating() {
        return null;
    }
    
    public final void setImdbRating(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDirector() {
        return null;
    }
    
    public final void setDirector(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWriter() {
        return null;
    }
    
    public final void setWriter(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActors() {
        return null;
    }
    
    public final void setActors(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDirector(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.movie_details.MovieDetails movieDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWriters(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.movie_details.MovieDetails movieDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getActors(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.movie_details.MovieDetails movieDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitleAndReleaseDate(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.movie_details.MovieDetails movieDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getYear(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.movie_details.MovieDetails movieDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTime(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.movie_details.MovieDetails movieDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRating(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.movie_details.MovieDetails movieDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.movie_details.MovieDetails movieDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGenres(@org.jetbrains.annotations.Nullable()
    com.guru.moviepagingtest.movie_details.MovieDetails movieDetails) {
        return null;
    }
    
    public MovieDetails() {
        super();
    }
}