package com.guru.moviepagingtest.upcoming_movies

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.guru.moviepagingtest.R
import com.guru.moviepagingtest.databinding.UpcomingMovieDataBinding
import com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.UpcomingMovieViewHolder

class SearchMoviesAdapter internal constructor(private val context: Context, private val onUpcomingMovieClickListener: OnUpcomingMovieClickListener) : PagedListAdapter<SearchMovie, UpcomingMovieViewHolder>(diffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpcomingMovieViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val upcomingMovieDataBinding: UpcomingMovieDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_movie, parent, false)
        return UpcomingMovieViewHolder(upcomingMovieDataBinding)
    }

    override fun onBindViewHolder(holder: UpcomingMovieViewHolder, position: Int) {
        val searchMovie = getItem(position)
        if (searchMovie != null) {
            holder.bindMovie(searchMovie)
        }
    }

    inner class UpcomingMovieViewHolder(private val upcomingMovieDataBinding: UpcomingMovieDataBinding) : RecyclerView.ViewHolder(upcomingMovieDataBinding.root) {
        fun bindMovie(searchMovie: SearchMovie?) {
            upcomingMovieDataBinding.upcomingMovie = searchMovie
            upcomingMovieDataBinding.onUpcomingMovieClickListener = onUpcomingMovieClickListener
        }

    }

    interface OnUpcomingMovieClickListener {
        fun onUpcomingMovieViewClick(searchMovie: SearchMovie?)
    }

    companion object {
        private val diffCallback: DiffUtil.ItemCallback<SearchMovie> = object : DiffUtil.ItemCallback<SearchMovie>() {
            override fun areItemsTheSame(oldMovie: SearchMovie, newMovie: SearchMovie): Boolean {
                return oldMovie.id === newMovie.id
            }

            override fun areContentsTheSame(oldMovie: SearchMovie, newMovie: SearchMovie): Boolean {
                return oldMovie == newMovie
            }
        }
    }

}