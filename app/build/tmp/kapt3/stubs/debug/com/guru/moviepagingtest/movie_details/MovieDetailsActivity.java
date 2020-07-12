package com.guru.moviepagingtest.movie_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\b\u0010#\u001a\u00020!H\u0002J\u0012\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020!2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u00102\u001a\u00020!H\u0002J\b\u00103\u001a\u00020!H\u0002J\u0012\u00104\u001a\u00020!2\b\u00105\u001a\u0004\u0018\u00010\u000eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/guru/moviepagingtest/movie_details/MovieDetailsActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "activityMovieDetailsBinding", "Lcom/guru/moviepagingtest/databinding/ActivityMovieDetailsBinding;", "manager", "Lcom/guru/moviepagingtest/utils/exo_player/ExoPlayerManager;", "movieDetailsViewModel", "Lcom/guru/moviepagingtest/movie_details/MovieDetailsViewModel;", "getMovieDetailsViewModel", "()Lcom/guru/moviepagingtest/movie_details/MovieDetailsViewModel;", "setMovieDetailsViewModel", "(Lcom/guru/moviepagingtest/movie_details/MovieDetailsViewModel;)V", "movieId", "", "movieIdFromIntent", "getMovieIdFromIntent", "()Ljava/lang/String;", "playVideoViewModel", "Lcom/guru/moviepagingtest/movie_details/play/PlayVideoViewModel;", "getPlayVideoViewModel", "()Lcom/guru/moviepagingtest/movie_details/play/PlayVideoViewModel;", "setPlayVideoViewModel", "(Lcom/guru/moviepagingtest/movie_details/play/PlayVideoViewModel;)V", "requestManager", "Lcom/bumptech/glide/RequestManager;", "getRequestManager", "()Lcom/bumptech/glide/RequestManager;", "setRequestManager", "(Lcom/bumptech/glide/RequestManager;)V", "trailerDialog", "Landroid/app/Dialog;", "extractYoutubeUrl", "", "youtubeLink", "initDialog", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "menuItem", "Landroid/view/MenuItem;", "playFirstTrailer", "playYoutubeVideo", "downloadUrl", "dialog", "setActionBar", "setMovieIdInMovieDetailsViewModel", "setPosterPathImageView", "posterPath", "app_debug"})
public final class MovieDetailsActivity extends dagger.android.support.DaggerAppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Inject()
    private com.guru.moviepagingtest.movie_details.MovieDetailsViewModel movieDetailsViewModel;
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Inject()
    private com.guru.moviepagingtest.movie_details.play.PlayVideoViewModel playVideoViewModel;
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Inject()
    private com.bumptech.glide.RequestManager requestManager;
    private java.lang.String movieId;
    private com.guru.moviepagingtest.databinding.ActivityMovieDetailsBinding activityMovieDetailsBinding;
    private android.app.Dialog trailerDialog;
    private com.guru.moviepagingtest.utils.exo_player.ExoPlayerManager manager;
    
    @org.jetbrains.annotations.Nullable()
    public final com.guru.moviepagingtest.movie_details.MovieDetailsViewModel getMovieDetailsViewModel() {
        return null;
    }
    
    public final void setMovieDetailsViewModel(@org.jetbrains.annotations.Nullable()
    com.guru.moviepagingtest.movie_details.MovieDetailsViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.guru.moviepagingtest.movie_details.play.PlayVideoViewModel getPlayVideoViewModel() {
        return null;
    }
    
    public final void setPlayVideoViewModel(@org.jetbrains.annotations.Nullable()
    com.guru.moviepagingtest.movie_details.play.PlayVideoViewModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bumptech.glide.RequestManager getRequestManager() {
        return null;
    }
    
    public final void setRequestManager(@org.jetbrains.annotations.Nullable()
    com.bumptech.glide.RequestManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.lang.String getMovieIdFromIntent() {
        return null;
    }
    
    private final void setActionBar() {
    }
    
    private final void setMovieIdInMovieDetailsViewModel() {
    }
    
    private final void setPosterPathImageView(java.lang.String posterPath) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void playFirstTrailer(java.lang.String movieId) {
    }
    
    private final void initDialog() {
    }
    
    private final void extractYoutubeUrl(java.lang.String youtubeLink) {
    }
    
    private final void playYoutubeVideo(java.lang.String downloadUrl, android.app.Dialog dialog) {
    }
    
    public MovieDetailsActivity() {
        super();
    }
}