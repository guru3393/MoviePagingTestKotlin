package com.guru.moviepagingtest.upcoming_movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u00022\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\u0018\u0010&\u001a\u00020\u00192\u000e\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0016J\u0012\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0010\u0010+\u001a\u00020\n2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010/\u001a\u00020\u0019H\u0002J\u0010\u0010\'\u001a\u00020\u00192\u0006\u00100\u001a\u000201H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "Landroidx/lifecycle/Observer;", "Landroidx/paging/PagedList;", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMovie;", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter$OnUpcomingMovieClickListener;", "()V", "activitySearchMoviesBinding", "Lcom/guru/moviepagingtest/databinding/ActivitySearchMoviesBinding;", "isLandscape", "", "()Z", "moviesRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "searchMoviesAdapter", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter;", "searchMoviesViewModel", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesViewModel;", "getSearchMoviesViewModel", "()Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesViewModel;", "setSearchMoviesViewModel", "(Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesViewModel;)V", "searchView", "Landroidx/appcompat/widget/SearchView;", "goToMovieDetailsActivity", "", "searchMovie", "hideProgressBar", "initMoviesAdapter", "initRecyclerView", "initSearchView", "searchItem", "Landroid/view/MenuItem;", "initSearchViewEditText", "isTablet", "context", "Landroid/content/Context;", "loadMovies", "onChanged", "searchMovies", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onUpcomingMovieViewClick", "reloadMovies", "searchText", "", "app_debug"})
public final class SearchMoviesActivity extends dagger.android.support.DaggerAppCompatActivity implements androidx.lifecycle.Observer<androidx.paging.PagedList<com.guru.moviepagingtest.upcoming_movies.SearchMovie>>, com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.OnUpcomingMovieClickListener {
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Inject()
    private com.guru.moviepagingtest.upcoming_movies.SearchMoviesViewModel searchMoviesViewModel;
    private com.guru.moviepagingtest.databinding.ActivitySearchMoviesBinding activitySearchMoviesBinding;
    private androidx.recyclerview.widget.RecyclerView moviesRecyclerView;
    private com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter searchMoviesAdapter;
    private androidx.appcompat.widget.SearchView searchView;
    
    @org.jetbrains.annotations.Nullable()
    public final com.guru.moviepagingtest.upcoming_movies.SearchMoviesViewModel getSearchMoviesViewModel() {
        return null;
    }
    
    public final void setSearchMoviesViewModel(@org.jetbrains.annotations.Nullable()
    com.guru.moviepagingtest.upcoming_movies.SearchMoviesViewModel p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final boolean isTablet(android.content.Context context) {
        return false;
    }
    
    private final boolean isLandscape() {
        return false;
    }
    
    private final void initMoviesAdapter() {
    }
    
    private final void loadMovies() {
    }
    
    private final void reloadMovies() {
    }
    
    private final void searchMovies(java.lang.String searchText) {
    }
    
    @java.lang.Override()
    public void onChanged(@org.jetbrains.annotations.NotNull()
    androidx.paging.PagedList<com.guru.moviepagingtest.upcoming_movies.SearchMovie> searchMovies) {
    }
    
    private final void hideProgressBar() {
    }
    
    @java.lang.Override()
    public void onUpcomingMovieViewClick(@org.jetbrains.annotations.Nullable()
    com.guru.moviepagingtest.upcoming_movies.SearchMovie searchMovie) {
    }
    
    private final void goToMovieDetailsActivity(com.guru.moviepagingtest.upcoming_movies.SearchMovie searchMovie) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    private final void initSearchView(android.view.MenuItem searchItem) {
    }
    
    private final void initSearchViewEditText() {
    }
    
    public SearchMoviesActivity() {
        super();
    }
}