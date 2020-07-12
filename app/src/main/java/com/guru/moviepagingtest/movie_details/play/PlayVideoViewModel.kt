package com.guru.moviepagingtest.movie_details.play

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class PlayVideoViewModel @Inject internal constructor(private val repository: PlayRepository) : ViewModel() {
    var trailersLiveData: LiveData<TrailersApiResponse>? = null
    fun setMovieId(movieId: String?) {
        trailersLiveData = repository.addTrailersToLiveData(movieId)
    }

}