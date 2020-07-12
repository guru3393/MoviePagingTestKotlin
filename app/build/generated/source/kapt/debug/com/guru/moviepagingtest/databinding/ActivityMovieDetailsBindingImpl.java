package com.guru.moviepagingtest.databinding;
import com.guru.moviepagingtest.R;
import com.guru.moviepagingtest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMovieDetailsBindingImpl extends ActivityMovieDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imagelayout, 7);
        sViewsWithIds.put(R.id.poster_path_image_view, 8);
        sViewsWithIds.put(R.id.playBtn, 9);
        sViewsWithIds.put(R.id.secondlayout, 10);
        sViewsWithIds.put(R.id.divider_one, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMovieDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityMovieDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[5]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , null
            , (android.widget.TextView) bindings[2]
            );
        this.genresTextView.setTag(null);
        this.languageTextView.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.overviewTextView.setTag(null);
        this.timeTextView.setTag(null);
        this.title.setTag(null);
        this.yearText.setTag(null);
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
        java.lang.String movieDetailsGetRatingMovieDetails = null;
        java.lang.String movieDetailsOverview = null;
        java.lang.String movieDetailsGetLanguageMovieDetails = null;
        java.lang.String movieDetailsGetTimeMovieDetails = null;
        java.lang.String movieDetailsGetTitleAndReleaseDateMovieDetails = null;
        java.lang.String movieDetailsGetYearMovieDetails = null;
        com.guru.moviepagingtest.movie_details.MovieDetails movieDetails = mMovieDetails;

        if ((dirtyFlags & 0x3L) != 0) {



                if (movieDetails != null && movieDetails != null) {
                    // read movieDetails.getRating(movieDetails)
                    movieDetailsGetRatingMovieDetails = movieDetails.getRating(movieDetails);
                    // read movieDetails.getRating(movieDetails)
                    movieDetailsGetRatingMovieDetails = movieDetails.getRating(movieDetails);
                    // read movieDetails.getLanguage(movieDetails)
                    movieDetailsGetLanguageMovieDetails = movieDetails.getLanguage(movieDetails);
                    // read movieDetails.getLanguage(movieDetails)
                    movieDetailsGetLanguageMovieDetails = movieDetails.getLanguage(movieDetails);
                    // read movieDetails.getTime(movieDetails)
                    movieDetailsGetTimeMovieDetails = movieDetails.getTime(movieDetails);
                    // read movieDetails.getTime(movieDetails)
                    movieDetailsGetTimeMovieDetails = movieDetails.getTime(movieDetails);
                    // read movieDetails.getTitleAndReleaseDate(movieDetails)
                    movieDetailsGetTitleAndReleaseDateMovieDetails = movieDetails.getTitleAndReleaseDate(movieDetails);
                    // read movieDetails.getTitleAndReleaseDate(movieDetails)
                    movieDetailsGetTitleAndReleaseDateMovieDetails = movieDetails.getTitleAndReleaseDate(movieDetails);
                    // read movieDetails.getYear(movieDetails)
                    movieDetailsGetYearMovieDetails = movieDetails.getYear(movieDetails);
                    // read movieDetails.getYear(movieDetails)
                    movieDetailsGetYearMovieDetails = movieDetails.getYear(movieDetails);
                }
                if (movieDetails != null) {
                    // read movieDetails.overview
                    movieDetailsOverview = movieDetails.getOverview();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.genresTextView, movieDetailsGetRatingMovieDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.languageTextView, movieDetailsGetLanguageMovieDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.overviewTextView, movieDetailsOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.timeTextView, movieDetailsGetTimeMovieDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, movieDetailsGetTitleAndReleaseDateMovieDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.yearText, movieDetailsGetYearMovieDetails);
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