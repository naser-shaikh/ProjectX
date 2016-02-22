package com.projectx.projectx.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;

/**
 * Created by Mrunalini Shaikh on 2/16/2016.
 */
public class Ui {

    /**
     * Simple utility method to show snack bar
     * @param a activity context
     * @param msg message to be displayed
     */
    public static void snackBar(Activity a, String msg) {
        Snackbar.make(a.findViewById(android.R.id.content), msg, Snackbar.LENGTH_SHORT).show();
    }

    /**
     * Simple utility method to show snack bar
     * @param a activity context
     * @param msg int id of resource message to be displayed
     */
    public static void snackBar(Activity a, @StringRes int msg) {
        snackBar(a, a.getString(msg));
    }

    /**
     * Helper method to show a simple spinner dialog to show the progress
     * @param c Context
     * @param title title of dialog
     * @return ProgressDialog
     */
    public static ProgressDialog alert(Context c, String title, DialogInterface.OnClickListener listener) {
        return (ProgressDialog) new ProgressDialog.Builder(c)
                .setTitle(title)
                .setMessage("Loading...")
                .setCancelable(false)
                .setPositiveButton("ok", listener)
                .create();
    }

    /**
     * This method will start a new activity
     * @param a Activity context
     * @param className Class name of component activity to start
     */
    public static void startActivity(Activity a, Class<?> className){
        a.startActivity(new Intent(a, className));
    }

}
