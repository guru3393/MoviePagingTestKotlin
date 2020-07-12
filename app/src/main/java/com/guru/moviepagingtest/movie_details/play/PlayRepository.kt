package com.guru.moviepagingtest.movie_details.play

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
internal class PlayRepository @Inject constructor(private val api: TheMovieDbApi) {
    fun addTrailersToLiveData(movieId: String?): MutableLiveData<TrailersApiResponse> {
        val trailersMutableLiveData = MutableLiveData<TrailersApiResponse>()
        val call = api.getTrailers(movieId, Constants.APY_KEY)
        val trailersApiResponseCallback: Callback<TrailersApiResponse?> = object : Callback<TrailersApiResponse?> {
            override fun onResponse(call: Call<TrailersApiResponse?>, response: Response<TrailersApiResponse?>) {
                val trailersApiResponse = response.body()
                if (trailersApiResponse != null) {
                    trailersMutableLiveData.value = trailersApiResponse
                }
            }

            override fun onFailure(call: Call<TrailersApiResponse?>, t: Throwable) {
                logMessage(t.message)
                createNewCall(call)
            }
        }
        call!!.enqueue(trailersApiResponseCallback)
        return trailersMutableLiveData
    }

}