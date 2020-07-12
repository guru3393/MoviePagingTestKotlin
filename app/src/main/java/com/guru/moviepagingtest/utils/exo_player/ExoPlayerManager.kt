package com.guru.moviepagingtest.utils.exo_player

import android.content.Context
import android.net.Uri
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.trackselection.TrackSelection
import com.google.android.exoplayer2.trackselection.TrackSelector
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util
import java.util.*

class ExoPlayerManager private constructor(mContext: Context) : Player.EventListener {
    val playerView: PlayerView
    private val dataSourceFactory: DefaultDataSourceFactory
    private var uriString = ""
    private val mPlayList: ArrayList<String>? = null
    private var playlistIndex = 0
    private val playerCallBack: CallBacks? = null
    private val mPlayer: SimpleExoPlayer
    override fun onPlayerStateChanged(playWhenReady: Boolean, playbackState: Int) {
        if (playbackState == 4 && mPlayList != null && playlistIndex + 1 < mPlayList.size) {
            playlistIndex++
            playerCallBack!!.onItemClickCallBack(playlistIndex)
            playStream(mPlayList[playlistIndex])
        } else if (playbackState == 4 && mPlayList != null && playlistIndex + 1 == mPlayList.size) {
            mPlayer.playWhenReady = false
        }
        if (playbackState == 4 && playerCallBack != null) {
            playerCallBack.onPlayingEnd()
        }
    }

    fun playStream(urlToPlay: String) {
        uriString = urlToPlay
        var mp4VideoUri = Uri.parse(uriString)
        val videoSource: MediaSource
        if (uriString.toUpperCase().contains("M3U8")) {
            videoSource = HlsMediaSource(mp4VideoUri, dataSourceFactory, null, null)
        } else {
            mp4VideoUri = Uri.parse(urlToPlay)
            videoSource = ExtractorMediaSource(mp4VideoUri, dataSourceFactory, DefaultExtractorsFactory(),
                    null, null)
        }
        mPlayer.prepare(videoSource)
        mPlayer.playWhenReady = true
    }

    fun destroyPlayer() {
        mPlayer.stop()
    }

    val isPlayerPlaying: Boolean
        get() = mPlayer.playWhenReady

    companion object {
        private val BANDWIDTH_METER = DefaultBandwidthMeter()
        private var mInstance: ExoPlayerManager? = null
        fun getInstance(mContext: Context): ExoPlayerManager? {
            if (mInstance == null) {
                mInstance = ExoPlayerManager(mContext)
            }
            return mInstance
        }
    }

    init {
        val videoTrackSelectionFactory: TrackSelection.Factory = AdaptiveTrackSelection.Factory()
        val trackSelector: TrackSelector = DefaultTrackSelector(videoTrackSelectionFactory)
        mPlayer = ExoPlayerFactory.newSimpleInstance(mContext, trackSelector)
        playerView = PlayerView(mContext)
        playerView.useController = true
        playerView.requestFocus()
        playerView.player = mPlayer
        val mp4VideoUri = Uri.parse(uriString)
        dataSourceFactory = DefaultDataSourceFactory(mContext, Util.getUserAgent(mContext, "androidwave"), BANDWIDTH_METER)
        val videoSource: MediaSource = ExtractorMediaSource.Factory(dataSourceFactory)
                .createMediaSource(mp4VideoUri)
        mPlayer.prepare(videoSource)
        mPlayer.addListener(this)
    }
}