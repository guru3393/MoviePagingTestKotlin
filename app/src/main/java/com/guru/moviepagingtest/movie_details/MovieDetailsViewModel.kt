package com.guru.moviepagingtest.movie_details

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MovieDetailsViewModel @Inject internal constructor(private val repository: MovieDetailsRepository) : ViewModel() {
    var movieDetailsLiveData: LiveData<MovieDetails>? = null
    fun setMovieId(movieId: String?) {
        movieDetailsLiveData = repository.addMovieDetailsToLiveData(movieId)
    }

}