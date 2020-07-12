package com.guru.moviepagingtest.movie_details

import com.google.gson.annotations.SerializedName

class MovieDetails internal constructor() {
    @SerializedName("imdbID")
    var id: String? = null

    @SerializedName("Title")
    var title: String? = null

    @SerializedName("Language")
    var language: String? = null

    //    @SerializedName("Genre")
    //    ArrayList genres;
    @SerializedName("Plot")
    var overview: String? = null

    @SerializedName("Released")
    var releaseDate: String? = null

    @SerializedName("Poster")
    var posterPath: String? = null

    @SerializedName("Runtime")
    var time: String? = null

    @SerializedName("Year")
    var year: String? = null

    @SerializedName("imdbRating")
    var imdbRating: String? = null

    @SerializedName("Director")
    var director: String? = null

    @SerializedName("Writer")
    var writer: String? = null

    @SerializedName("Actors")
    var actors: String? = null
    fun getDirector(movieDetails: MovieDetails): String? {
        return movieDetails.director
    }

    fun getWriters(movieDetails: MovieDetails): String? {
        return movieDetails.writer
    }

    fun getActors(movieDetails: MovieDetails): String? {
        return movieDetails.actors
    }

    fun getTitleAndReleaseDate(movieDetails: MovieDetails): String {
        return movieDetails.title + " (" + movieDetails.releaseDate!!.substring(0, 4) + ")"
    }

    fun getYear(movieDetails: MovieDetails): String? {
        return movieDetails.year
    }

    fun getTime(movieDetails: MovieDetails): String? {
        return movieDetails.time
    }

    fun getRating(movieDetails: MovieDetails): String {
        return "IMDB " + movieDetails.imdbRating
    }

    fun getLanguage(movieDetails: MovieDetails): String {
        val language = movieDetails.language
        return language!!.substring(0, 1).toUpperCase() + language.substring(1)
    }

    fun getGenres(movieDetails: MovieDetails?): String {
//        ArrayList genres = movieDetails.genres;
//        StringBuilder genresStringBuilder = new StringBuilder();
//        String separator = ", ";
//        for (int i = 0 ; i < genres.size(); i++) {
//            LinkedTreeMap treeMap = (LinkedTreeMap) genres.get(i);
//            String name = (String) treeMap.get("name");
//            if (name != null) {
//                if (i == genres.size() - 1) {
//                    separator = ".";
//                }
//                genresStringBuilder.append(name).append(separator);
//            }
//        }
//        return "Genres: " + genresStringBuilder;
        return ""
    }
}