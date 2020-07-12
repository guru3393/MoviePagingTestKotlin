package com.guru.moviepagingtest;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.guru.moviepagingtest.databinding.ActivityMovieDetailsBindingImpl;
import com.guru.moviepagingtest.databinding.ActivityMovieDetailsBindingSw600dpLandImpl;
import com.guru.moviepagingtest.databinding.ActivitySearchMoviesBindingImpl;
import com.guru.moviepagingtest.databinding.UpcomingMovieDataBindingImpl;
import com.guru.moviepagingtest.databinding.UpcomingMovieDataBindingSw600dpImpl;
import com.guru.moviepagingtest.databinding.UpcomingMovieDataBindingSw600dpLandImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMOVIEDETAILS = 1;

  private static final int LAYOUT_ACTIVITYSEARCHMOVIES = 2;

  private static final int LAYOUT_ITEMMOVIE = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guru.moviepagingtest.R.layout.activity_movie_details, LAYOUT_ACTIVITYMOVIEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guru.moviepagingtest.R.layout.activity_search_movies, LAYOUT_ACTIVITYSEARCHMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.guru.moviepagingtest.R.layout.item_movie, LAYOUT_ITEMMOVIE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMOVIEDETAILS: {
          if ("layout-sw600dp-land/activity_movie_details_0".equals(tag)) {
            return new ActivityMovieDetailsBindingSw600dpLandImpl(component, view);
          }
          if ("layout/activity_movie_details_0".equals(tag)) {
            return new ActivityMovieDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_movie_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCHMOVIES: {
          if ("layout/activity_search_movies_0".equals(tag)) {
            return new ActivitySearchMoviesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search_movies is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIE: {
          if ("layout-sw600dp/item_movie_0".equals(tag)) {
            return new UpcomingMovieDataBindingSw600dpImpl(component, view);
          }
          if ("layout/item_movie_0".equals(tag)) {
            return new UpcomingMovieDataBindingImpl(component, view);
          }
          if ("layout-sw600dp-land/item_movie_0".equals(tag)) {
            return new UpcomingMovieDataBindingSw600dpLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "movieDetails");
      sKeys.put(2, "onUpcomingMovieClickListener");
      sKeys.put(3, "upcomingMovie");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout-sw600dp-land/activity_movie_details_0", com.guru.moviepagingtest.R.layout.activity_movie_details);
      sKeys.put("layout/activity_movie_details_0", com.guru.moviepagingtest.R.layout.activity_movie_details);
      sKeys.put("layout/activity_search_movies_0", com.guru.moviepagingtest.R.layout.activity_search_movies);
      sKeys.put("layout-sw600dp/item_movie_0", com.guru.moviepagingtest.R.layout.item_movie);
      sKeys.put("layout/item_movie_0", com.guru.moviepagingtest.R.layout.item_movie);
      sKeys.put("layout-sw600dp-land/item_movie_0", com.guru.moviepagingtest.R.layout.item_movie);
    }
  }
}
