package com.projectx.projectx.log;

/**
 * Created by Naser Shaikh on 2/16/2016.
 */
public class Log {
    public static final String TAG = "projectx";

    public static void msg(String log){
        android.util.Log.d(TAG, log);
    }
}
