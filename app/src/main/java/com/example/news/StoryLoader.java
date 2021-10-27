package com.example.news;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class StoryLoader extends AsyncTaskLoader<List<Story>> {

    private String mUrl;

    public StoryLoader(@NonNull Context context, String mUrl) {
        super(context);
        this.mUrl = mUrl;
    }

    @Override
    protected void onStartLoading() {
        onForceLoad();
    }

    @Nullable
    @Override
    public List<Story> loadInBackground() {
        if (mUrl == null)
            return null;

        List stories = Utils.fetchStoryData(mUrl);
        return stories;
    }
}