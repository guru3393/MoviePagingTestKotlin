package com.guru.moviepagingtest.databinding;
import com.guru.moviepagingtest.R;
import com.guru.moviepagingtest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMovieDetailsBindingSw600dpLandImpl extends ActivityMovieDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.poster_path_image_view, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMovieDetailsBindingSw600dpLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityMovieDetailsBindingSw600dpLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , null
            , (android.widget.TextView) bindings[3]
            , null
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , null
            , (android.widget.ImageView) bindings[5]
            , null
            , null
            , null
            , (android.widget.TextView) bindings[1]
            , null
            );
        this.genresTextView.setTag(null);
        this.languageTextView.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.overviewTextView.setTag(null);
        this.titleAndReleaseDateTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.movieDetails == variableId) {
            setMovieDetails((com.guru.moviepagingtest.movie_details.MovieDetails) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovieDetails(@Nullable com.guru.moviepagingtest.movie_details.MovieDetails MovieDetails) {
        this.mMovieDetails = MovieDetails;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movieDetails);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String movieDetailsOverview = null;
        java.lang.String movieDetailsGetLanguageMovieDetails = null;
        java.lang.String movieDetailsGetTitleAndReleaseDateMovieDetails = null;
        java.lang.String movieDetailsGetGenresMovieDetails = null;
        com.guru.moviepagingtest.movie_details.MovieDetails movieDetails = mMovieDetails;

        if ((dirtyFlags & 0x3L) != 0) {



                if (movieDetails != null) {
                    // read movieDetails.overview
                    movieDetailsOverview = movieDetails.getOverview();
                }
                if (movieDetails != null && movieDetails != null) {
                    // read movieDetails.getLanguage(movieDetails)
                    movieDetailsGetLanguageMovieDetails = movieDetails.getLanguage(movieDetails);
                    // read movieDetails.getLanguage(movieDetails)
                    movieDetailsGetLanguageMovieDetails = movieDetails.getLanguage(movieDetails);
                    // read movieDetails.getTitleAndReleaseDate(movieDetails)
                    movieDetailsGetTitleAndReleaseDateMovieDetails = movieDetails.getTitleAndReleaseDate(movieDetails);
                    // read movieDetails.getTitleAndReleaseDate(movieDetails)
                    movieDetailsGetTitleAndReleaseDateMovieDetails = movieDetails.getTitleAndReleaseDate(movieDetails);
                    // read movieDetails.getGenres(movieDetails)
                    movieDetailsGetGenresMovieDetails = movieDetails.getGenres(movieDetails);
                    // read movieDetails.getGenres(movieDetails)
                    movieDetailsGetGenresMovieDetails = movieDetails.getGenres(movieDetails);
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.genresTextView, movieDetailsGetGenresMovieDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.languageTextView, movieDetailsGetLanguageMovieDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.overviewTextView, movieDetailsOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleAndReleaseDateTextView, movieDetailsGetTitleAndReleaseDateMovieDetails);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movieDetails
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}