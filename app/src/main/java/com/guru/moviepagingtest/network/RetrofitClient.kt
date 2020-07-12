package com.guru.moviepagingtest.network

import com.guru.moviepagingtest.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient private constructor() {
    private val retrofit: Retrofit
    val theMovieDbApi: TheMovieDbApi
        get() = retrofit.create(TheMovieDbApi::class.java)

    companion object {
        private var retrofitClient: RetrofitClient? = null

        val instance: RetrofitClient?
            get() {
                if (retrofitClient == null) {
                    retrofitClient = RetrofitClient()
                }
                return retrofitClient
            }
    }

    init {
        retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}