package com.guru.moviepagingtest.upcoming_movies

import com.google.gson.annotations.SerializedName

class SearchMovie(@field:SerializedName("imdbID") var id: String, @field:SerializedName("Title") var title: String, @field:SerializedName("Poster") var posterPath: String) {

    @SerializedName("Year")
    var Year: String? = null

    @SerializedName("Type")
    var Type: String? = null
    override fun equals(obj: Any?): Boolean {
        return super.equals(obj)
    }

}