package com.guru.moviepagingtest.utils.exo_player;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/guru/moviepagingtest/utils/exo_player/ExoPlayerManager;", "Lcom/google/android/exoplayer2/Player$EventListener;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DefaultDataSourceFactory;", "isPlayerPlaying", "", "()Z", "mPlayList", "Ljava/util/ArrayList;", "", "mPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "playerCallBack", "Lcom/guru/moviepagingtest/utils/exo_player/CallBacks;", "playerView", "Lcom/google/android/exoplayer2/ui/PlayerView;", "getPlayerView", "()Lcom/google/android/exoplayer2/ui/PlayerView;", "playlistIndex", "", "uriString", "destroyPlayer", "", "onPlayerStateChanged", "playWhenReady", "playbackState", "playStream", "urlToPlay", "Companion", "app_debug"})
public final class ExoPlayerManager implements com.google.android.exoplayer2.Player.EventListener {
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.exoplayer2.ui.PlayerView playerView = null;
    private final com.google.android.exoplayer2.upstream.DefaultDataSourceFactory dataSourceFactory = null;
    private java.lang.String uriString = "";
    private final java.util.ArrayList<java.lang.String> mPlayList = null;
    private int playlistIndex = 0;
    private final com.guru.moviepagingtest.utils.exo_player.CallBacks playerCallBack = null;
    private final com.google.android.exoplayer2.SimpleExoPlayer mPlayer = null;
    private static final com.google.android.exoplayer2.upstream.DefaultBandwidthMeter BANDWIDTH_METER = null;
    private static com.guru.moviepagingtest.utils.exo_player.ExoPlayerManager mInstance;
    public static final com.guru.moviepagingtest.utils.exo_player.ExoPlayerManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.exoplayer2.ui.PlayerView getPlayerView() {
        return null;
    }
    
    @java.lang.Override()
    public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
    }
    
    public final void playStream(@org.jetbrains.annotations.NotNull()
    java.lang.String urlToPlay) {
    }
    
    public final void destroyPlayer() {
    }
    
    public final boolean isPlayerPlaying() {
        return false;
    }
    
    private ExoPlayerManager(android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/guru/moviepagingtest/utils/exo_player/ExoPlayerManager$Companion;", "", "()V", "BANDWIDTH_METER", "Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;", "mInstance", "Lcom/guru/moviepagingtest/utils/exo_player/ExoPlayerManager;", "getInstance", "mContext", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.guru.moviepagingtest.utils.exo_player.ExoPlayerManager getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}