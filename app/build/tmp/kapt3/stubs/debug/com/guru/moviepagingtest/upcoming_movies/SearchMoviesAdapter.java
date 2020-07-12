package com.guru.moviepagingtest.upcoming_movies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0012\u0013\u0014B\u0017\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMovie;", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter$UpcomingMovieViewHolder;", "context", "Landroid/content/Context;", "onUpcomingMovieClickListener", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter$OnUpcomingMovieClickListener;", "(Landroid/content/Context;Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter$OnUpcomingMovieClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "OnUpcomingMovieClickListener", "UpcomingMovieViewHolder", "app_debug"})
public final class SearchMoviesAdapter extends androidx.paging.PagedListAdapter<com.guru.moviepagingtest.upcoming_movies.SearchMovie, com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.UpcomingMovieViewHolder> {
    private final android.content.Context context = null;
    private final com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.OnUpcomingMovieClickListener onUpcomingMovieClickListener = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.guru.moviepagingtest.upcoming_movies.SearchMovie> diffCallback = null;
    public static final com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.UpcomingMovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.UpcomingMovieViewHolder holder, int position) {
    }
    
    public SearchMoviesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.OnUpcomingMovieClickListener onUpcomingMovieClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter$UpcomingMovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "upcomingMovieDataBinding", "Lcom/guru/moviepagingtest/databinding/UpcomingMovieDataBinding;", "(Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter;Lcom/guru/moviepagingtest/databinding/UpcomingMovieDataBinding;)V", "bindMovie", "", "searchMovie", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMovie;", "app_debug"})
    public final class UpcomingMovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.guru.moviepagingtest.databinding.UpcomingMovieDataBinding upcomingMovieDataBinding = null;
        
        public final void bindMovie(@org.jetbrains.annotations.Nullable()
        com.guru.moviepagingtest.upcoming_movies.SearchMovie searchMovie) {
        }
        
        public UpcomingMovieViewHolder(@org.jetbrains.annotations.NotNull()
        com.guru.moviepagingtest.databinding.UpcomingMovieDataBinding upcomingMovieDataBinding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter$OnUpcomingMovieClickListener;", "", "onUpcomingMovieViewClick", "", "searchMovie", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMovie;", "app_debug"})
    public static abstract interface OnUpcomingMovieClickListener {
        
        public abstract void onUpcomingMovieViewClick(@org.jetbrains.annotations.Nullable()
        com.guru.moviepagingtest.upcoming_movies.SearchMovie searchMovie);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/guru/moviepagingtest/upcoming_movies/SearchMoviesAdapter$Companion;", "", "()V", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/guru/moviepagingtest/upcoming_movies/SearchMovie;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}