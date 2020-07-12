package com.guru.moviepagingtest.upcoming_movies

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.text.InputType
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guru.moviepagingtest.R
import com.guru.moviepagingtest.databinding.ActivitySearchMoviesBinding
import com.guru.moviepagingtest.movie_details.MovieDetailsActivity
import com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.OnUpcomingMovieClickListener
import com.guru.moviepagingtest.utils.Constants

import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SearchMoviesActivity : DaggerAppCompatActivity(), Observer<PagedList<SearchMovie?>>, OnUpcomingMovieClickListener {
    @Inject
    var searchMoviesViewModel: SearchMoviesViewModel? = null
    private var activitySearchMoviesBinding: ActivitySearchMoviesBinding? = null
    private var moviesRecyclerView: RecyclerView? = null
    private var searchMoviesAdapter: SearchMoviesAdapter? = null
    private var searchView: SearchView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySearchMoviesBinding = DataBindingUtil.setContentView(this, R.layout.activity_search_movies)
        initRecyclerView()
        initMoviesAdapter()
        loadMovies()
    }

    private fun initRecyclerView() {
        moviesRecyclerView = activitySearchMoviesBinding!!.moviesRecyclerView
        val context = moviesRecyclerView!!.context
        val orientation = RecyclerView.HORIZONTAL
        var horizontalGridLayoutManager: GridLayoutManager
        if (isLandscape) {
            horizontalGridLayoutManager = GridLayoutManager(context, Constants.LANDSCAPE_SPAN_COUNT)
            if (isTablet(this)) {
                horizontalGridLayoutManager = GridLayoutManager(context, Constants.TABLET_SPAN_COUNT, orientation, false)
            }
            moviesRecyclerView!!.layoutManager = horizontalGridLayoutManager
        }
    }

    private fun isTablet(context: Context): Boolean {
        return (context.resources.configuration.screenLayout
                and Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE
    }

    private val isLandscape: Boolean
        private get() {
            val orientation = resources.configuration.orientation
            return orientation == Configuration.ORIENTATION_LANDSCAPE
        }

    private fun initMoviesAdapter() {
        searchMoviesAdapter = SearchMoviesAdapter(this, this)
        moviesRecyclerView!!.adapter = searchMoviesAdapter
    }

    private fun loadMovies() {
        searchMoviesViewModel!!.pagedListLiveData.observe(this, this)


    }

    private fun reloadMovies() {
        searchMoviesViewModel!!.replaceSubscription(this, null)
        loadMovies()
    }

    private fun searchMovies(searchText: String) {
        searchMoviesViewModel!!.replaceSubscription(this, searchText)
        loadMovies()
    }

    override fun onChanged(searchMovies: PagedList<SearchMovie?>) {
        searchMoviesAdapter!!.submitList(searchMovies)
        hideProgressBar()
    }

    private fun hideProgressBar() {
        activitySearchMoviesBinding!!.progressBar.visibility = View.GONE
    }

    override fun onUpcomingMovieViewClick(searchMovie: SearchMovie?) {
        goToMovieDetailsActivity(searchMovie)
    }

    private fun goToMovieDetailsActivity(searchMovie: SearchMovie?) {
        val intent = Intent(this, MovieDetailsActivity::class.java)
        val movieId = searchMovie!!.id
        intent.putExtra("movieId", movieId)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_upcoming_movies, menu)
        val searchItem = menu.findItem(R.id.search)
        initSearchView(searchItem)
        initSearchViewEditText()
        return true
    }

    private fun initSearchView(searchItem: MenuItem) {
        searchView = searchItem.actionView as SearchView
        searchView!!.queryHint = "Search..."
        searchView!!.setOnCloseListener {
            reloadMovies()
            false
        }
    }

    private fun initSearchViewEditText() {
        val searchViewEditText = searchView!!.findViewById<EditText>(androidx.appcompat.R.id.search_src_text)
        searchViewEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_WORDS
        searchView!!.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(s: String): Boolean {
                return false
            }

            override fun onQueryTextChange(searchText: String): Boolean {
                if (searchText.length > 0) {
                    searchMovies(searchText)
                }
                return false
            }
        })
    }
}

private fun <T> LiveData<T>.observe(searchMoviesActivity: SearchMoviesActivity, searchMoviesActivity1: SearchMoviesActivity) {

}
