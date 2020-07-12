package com.guru.moviepagingtest.movie_details

import androidx.lifecycle.MutableLiveData
import com.guru.moviepagingtest.network.TheMovieDbApi
import com.guru.moviepagingtest.utils.Constants
import com.guru.moviepagingtest.utils.HelperClass.createNewCall
import com.guru.moviepagingtest.utils.HelperClass.logMessage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieDetailsRepository @Inject internal constructor(private val api: TheMovieDbApi) {
    fun addMovieDetailsToLiveData(movieId: String?): MutableLiveData<MovieDetails> {
        val movieDetailsMutableLiveData = MutableLiveData<MovieDetails>()
        val call = api.getMovieDetails(movieId, Constants.APY_KEY)
        val movieDetailsCallback: Callback<MovieDetails?> = object : Callback<MovieDetails?> {
            override fun onResponse(call: Call<MovieDetails?>, response: Response<MovieDetails?>) {
                val movieDetails = response.body()
                if (movieDetails != null) {
                    movieDetailsMutableLiveData.value = movieDetails
                }
            }

            override fun onFailure(call: Call<MovieDetails?>, t: Throwable) {
                logMessage(t.message)
                createNewCall(call)
            }
        }
        call!!.enqueue(movieDetailsCallback)
        return movieDetailsMutableLiveData
    }

}