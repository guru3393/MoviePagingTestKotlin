package com.guru.moviepagingtest.movie_details

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.SparseArray
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import at.huber.youtubeExtractor.VideoMeta
import at.huber.youtubeExtractor.YouTubeExtractor
import at.huber.youtubeExtractor.YtFile
import com.bumptech.glide.RequestManager
import com.google.android.exoplayer2.ui.PlayerView
import com.guru.moviepagingtest.R
import com.guru.moviepagingtest.databinding.ActivityMovieDetailsBinding
import com.guru.moviepagingtest.movie_details.play.PlayVideoViewModel
import com.guru.moviepagingtest.movie_details.play.TrailersApiResponse
import com.guru.moviepagingtest.utils.HelperClass.getEntirePosterPathUrl
import com.guru.moviepagingtest.utils.exo_player.ExoPlayerManager
import com.guru.moviepagingtest.utils.exo_player.ExoPlayerManager.Companion.getInstance
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MovieDetailsActivity : DaggerAppCompatActivity() {
    @Inject
    var movieDetailsViewModel: MovieDetailsViewModel? = null

    @Inject
    var playVideoViewModel: PlayVideoViewModel? = null

    @Inject
    var requestManager: RequestManager? = null
    private var movieId: String? = null
    private var activityMovieDetailsBinding: ActivityMovieDetailsBinding? = null
    private var trailerDialog: Dialog? = null
    private var manager: ExoPlayerManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMovieDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie_details)
        movieId = movieIdFromIntent
        setActionBar()
        setMovieIdInMovieDetailsViewModel()
    }

    private val movieIdFromIntent: String
        private get() = intent.getSerializableExtra("movieId") as String

    private fun setActionBar() {
        val actionBar = supportActionBar
        actionBar?.hide()
        //        setTitle("Movie Details");
    }

    private fun setMovieIdInMovieDetailsViewModel() {
        movieDetailsViewModel!!.setMovieId(movieId)
        movieDetailsViewModel!!.movieDetailsLiveData!!.observe(this, Observer { movieDetails: MovieDetails ->
            setPosterPathImageView(movieDetails.posterPath)
            activityMovieDetailsBinding!!.movieDetails = movieDetails
        })
    }

    private fun setPosterPathImageView(posterPath: String?) {
        if (posterPath != null) {
            val entirePosterPath = getEntirePosterPathUrl(posterPath)
            requestManager!!.load(entirePosterPath).into(activityMovieDetailsBinding!!.posterPathImageView)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_movie_details, menu)
        return true
    }

    override fun onOptionsItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
            R.id.play -> {
                initDialog()
                playFirstTrailer(movieId)
            }
        }
        return super.onOptionsItemSelected(menuItem)
    }

    private fun playFirstTrailer(movieId: String?) {
        playVideoViewModel!!.setMovieId(movieId)
        playVideoViewModel!!.trailersLiveData?.observe(this, Observer { trailersApiResponse: TrailersApiResponse? ->
            if (trailersApiResponse != null) {
                val trailers = trailersApiResponse.trailers
                val firstTrailer = trailers[0]
                val youtubeLink = firstTrailer.key
                extractYoutubeUrl(youtubeLink)
            }
        })
    }

    private fun initDialog() {
        trailerDialog = Dialog(this)
        trailerDialog!!.setContentView(R.layout.dialog)
        trailerDialog!!.setOnCancelListener { dialog: DialogInterface? ->
            if (manager!!.isPlayerPlaying) {
                manager!!.destroyPlayer()
            }
        }
        trailerDialog!!.show()
    }

    private fun extractYoutubeUrl(youtubeLink: String) {
        @SuppressLint("StaticFieldLeak") val extractor: YouTubeExtractor = object : YouTubeExtractor(this) {
            override fun onExtractionComplete(sparseArray: SparseArray<YtFile>, videoMeta: VideoMeta) {
                if (sparseArray != null) {
                    playYoutubeVideo(sparseArray[18].url, trailerDialog)
                }
            }
        }
        extractor.extract(youtubeLink, true, true)
    }

    private fun playYoutubeVideo(downloadUrl: String, dialog: Dialog?) {
        val playerView: PlayerView = dialog!!.findViewById(R.id.player_view)
        manager = getInstance(this)
        playerView.player = manager!!.playerView.player
        manager!!.playStream(downloadUrl)
    }
}