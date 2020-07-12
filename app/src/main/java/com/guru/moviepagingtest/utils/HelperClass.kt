package com.guru.moviepagingtest.utils

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.guru.moviepagingtest.R
import retrofit2.Call

object HelperClass {
    fun getEntirePosterPathUrl(posterPath: String?): String {
         //            return POSTER_PATH_BASE_URL + posterPath.replace("\\", "").replace("/", "");
        return  posterPath ?: ""
    }

    fun logMessage(message: String?) {
        Log.d(Constants.TAG, message)
    }

    fun createNewCall(call: Call<*>) {
        call.clone()
    }

    @BindingAdapter("android:posterPath")
    fun setPosterToImageView(posterImageView: ImageView, posterPath: String?) {
        val entirePosterPath = getEntirePosterPathUrl(posterPath)
        Glide.with(posterImageView.context).load(entirePosterPath)
                .placeholder(R.drawable.placeholder)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(posterImageView)
    }
}