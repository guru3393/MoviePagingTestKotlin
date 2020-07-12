package com.guru.moviepagingtest.upcoming_movies

import com.google.gson.annotations.SerializedName
import java.util.*

class SearchMoviesApiResponse {
    @SerializedName("Search")
    var searchMovies: List<SearchMovie> = ArrayList()

    @SerializedName("totalResults")
    var totalPages = 0

    @SerializedName("Response")
    var Response: String? = null
}