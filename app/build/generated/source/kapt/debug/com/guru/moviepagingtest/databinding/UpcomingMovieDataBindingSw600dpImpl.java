package com.guru.moviepagingtest.databinding;
import com.guru.moviepagingtest.R;
import com.guru.moviepagingtest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class UpcomingMovieDataBindingSw600dpImpl extends UpcomingMovieDataBinding implements com.guru.moviepagingtest.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UpcomingMovieDataBindingSw600dpImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private UpcomingMovieDataBindingSw600dpImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        ensureBindingComponentIsNotNull(com.guru.moviepagingtest.utils.HelperClass.class);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.posterImageView.setTag(null);
        this.titleTextView.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.guru.moviepagingtest.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.upcomingMovie == variableId) {
            setUpcomingMovie((com.guru.moviepagingtest.upcoming_movies.SearchMovie) variable);
        }
        else if (BR.onUpcomingMovieClickListener == variableId) {
            setOnUpcomingMovieClickListener((com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.OnUpcomingMovieClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUpcomingMovie(@Nullable com.guru.moviepagingtest.upcoming_movies.SearchMovie UpcomingMovie) {
        this.mUpcomingMovie = UpcomingMovie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.upcomingMovie);
        super.requestRebind();
    }
    public void setOnUpcomingMovieClickListener(@Nullable com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.OnUpcomingMovieClickListener OnUpcomingMovieClickListener) {
        this.mOnUpcomingMovieClickListener = OnUpcomingMovieClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.onUpcomingMovieClickListener);
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
        com.guru.moviepagingtest.upcoming_movies.SearchMovie upcomingMovie = mUpcomingMovie;
        com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.OnUpcomingMovieClickListener onUpcomingMovieClickListener = mOnUpcomingMovieClickListener;
        java.lang.String upcomingMovieTitle = null;
        java.lang.String upcomingMoviePosterPath = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (upcomingMovie != null) {
                    // read upcomingMovie.title
                    upcomingMovieTitle = upcomingMovie.getTitle();
                    // read upcomingMovie.posterPath
                    upcomingMoviePosterPath = upcomingMovie.getPosterPath();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mBindingComponent.getHelperClass().setPosterToImageView(this.posterImageView, upcomingMoviePosterPath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTextView, upcomingMovieTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // upcomingMovie
        com.guru.moviepagingtest.upcoming_movies.SearchMovie upcomingMovie = mUpcomingMovie;
        // onUpcomingMovieClickListener
        com.guru.moviepagingtest.upcoming_movies.SearchMoviesAdapter.OnUpcomingMovieClickListener onUpcomingMovieClickListener = mOnUpcomingMovieClickListener;
        // onUpcomingMovieClickListener != null
        boolean onUpcomingMovieClickListenerJavaLangObjectNull = false;



        onUpcomingMovieClickListenerJavaLangObjectNull = (onUpcomingMovieClickListener) != (null);
        if (onUpcomingMovieClickListenerJavaLangObjectNull) {



            onUpcomingMovieClickListener.onUpcomingMovieViewClick(upcomingMovie);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): upcomingMovie
        flag 1 (0x2L): onUpcomingMovieClickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}