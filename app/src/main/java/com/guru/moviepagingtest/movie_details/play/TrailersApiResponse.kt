package com.guru.moviepagingtest.movie_details.play

import com.google.gson.annotations.SerializedName
import java.util.*

class TrailersApiResponse {
    @SerializedName("results")
    var trailers: List<Trailer> = ArrayList()
}