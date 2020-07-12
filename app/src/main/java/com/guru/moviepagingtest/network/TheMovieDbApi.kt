package com.guru.moviepagingtest.network

import com.guru.moviepagingtest.movie_details.MovieDetails
import com.guru.moviepagingtest.movie_details.play.TrailersApiResponse
import com.guru.moviepagingtest.upcoming_movies.SearchMoviesApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDbApi {
    @GET(".")
    fun getMovies(
            @Query("apikey") apiKey: String?,
            @Query("page") page: Int,
            @Query("s") Marvel: String?,
            @Query("type") type: String?
    ): Call<SearchMoviesApiResponse?>?

    @GET(".")
    fun getSearchedMovies(
            @Query("s") query: String?,
            @Query("apikey") apiKey: String?,
            @Query("page") page: Int,
            @Query("type") type: String?
    ): Call<SearchMoviesApiResponse?>?

    @GET(".")
    fun getMovieDetails(
            @Query("i") id: String?,
            @Query("apikey") apiKey: String?
    ): Call<MovieDetails?>?

    @GET("movie/{movie_id}/videos")
    fun getTrailers(
            @Path("i") id: String?,
            @Query("apikey") apiKey: String?
    ): Call<TrailersApiResponse?>?
}