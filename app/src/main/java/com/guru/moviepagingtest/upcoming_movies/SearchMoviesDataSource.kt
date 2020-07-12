package com.guru.moviepagingtest.upcoming_movies

import androidx.paging.PageKeyedDataSource
import com.guru.moviepagingtest.network.RetrofitClient
import com.guru.moviepagingtest.network.TheMovieDbApi
import com.guru.moviepagingtest.utils.Constants
import com.guru.moviepagingtest.utils.HelperClass.createNewCall
import com.guru.moviepagingtest.utils.HelperClass.logMessage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchMoviesDataSource internal constructor(private val searchText: String?) : PageKeyedDataSource<Int, SearchMovie?>() {
    private val api: TheMovieDbApi = (RetrofitClient.instance?.theMovieDbApi ?: null) as TheMovieDbApi
    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, SearchMovie?>) {
        val call = getTheMovieDbApiResponseCall(Constants.FIRST_PAGE)
        val upcomingMoviesCallback: Callback<SearchMoviesApiResponse?> = object : Callback<SearchMoviesApiResponse?> {
            override fun onResponse(call: Call<SearchMoviesApiResponse?>, response: Response<SearchMoviesApiResponse?>) {
                val searchMoviesApiResponse = response.body()
                if (searchMoviesApiResponse != null) {
                    callback.onResult(searchMoviesApiResponse.searchMovies, null, Constants.FIRST_PAGE + 1)
                }
            }

            override fun onFailure(call: Call<SearchMoviesApiResponse?>, t: Throwable) {
                logMessage(t.message)
                createNewCall(call)
            }
        }
        call!!.enqueue(upcomingMoviesCallback)
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, SearchMovie?>) {}
    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, SearchMovie?>) {
        val call = getTheMovieDbApiResponseCall(params.key)
        val upcomingMoviesCallback: Callback<SearchMoviesApiResponse?> = object : Callback<SearchMoviesApiResponse?> {
            override fun onResponse(call: Call<SearchMoviesApiResponse?>, response: Response<SearchMoviesApiResponse?>) {
                val searchMoviesApiResponse = response.body()
                if (searchMoviesApiResponse != null) {
                    val key = if (params.key <= searchMoviesApiResponse.totalPages) params.key + 1 else null
                    callback.onResult(searchMoviesApiResponse.searchMovies, key)
                }
            }

            override fun onFailure(call: Call<SearchMoviesApiResponse?>, t: Throwable) {
                logMessage(t.message)
                createNewCall(call)
            }
        }
        call!!.enqueue(upcomingMoviesCallback)
    }

    private fun getTheMovieDbApiResponseCall(pageNumber: Int): Call<SearchMoviesApiResponse?>? {
        return if (searchText == null) api.getMovies(Constants.APY_KEY, pageNumber, "Marvel", "movie") else api.getSearchedMovies(searchText, Constants.APY_KEY, pageNumber, "movie")
    }

}