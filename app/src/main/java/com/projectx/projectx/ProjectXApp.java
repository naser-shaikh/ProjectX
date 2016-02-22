package com.projectx.projectx;

import android.app.Application;
import android.content.Context;

/**
 * Created by Naser Shaikh on 2/16/2016.
 */
public class ProjectXApp extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        // init app context
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
