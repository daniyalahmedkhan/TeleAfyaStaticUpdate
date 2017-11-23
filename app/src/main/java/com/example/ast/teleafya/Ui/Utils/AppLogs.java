package com.example.ast.teleafya.Ui.Utils;

import android.util.Log;

/**
 * Created by Faiz on 7/19/2017.
 */

public class AppLogs {
    private static String TAG = "Recruitment System";

    public static void logd(String msg) {
        Log.d(TAG, msg);
    }

    public static void loge(String msg) {
        Log.e(TAG, msg);
    }

    public static void logw(String msg) {
        Log.w(TAG, msg);
    }

    public static void logi(String msg) {
        Log.i(TAG, msg);
    }


    public static int v(String tag, String msg) {
        return Log.v(tag,msg);
    }

    public static int v(String tag, String msg, Throwable tr) {
        return Log.v(tag,msg,tr);
    }

    public static int d(String tag, String msg) {
        return Log.d(tag,msg);
    }


    public static int d(String tag, String msg, Throwable tr) {
        return Log.d(tag,msg,tr);
    }

    public static int i(String tag, String msg) {
        return Log.i(tag,msg);
    }

    public static int i(String tag, String msg, Throwable tr) {
        return Log.i(tag,msg,tr);
    }

    public static int w(String tag, String msg) {
        return Log.w(tag,msg);
    }

    public static int w(String tag, String msg, Throwable tr) {
        return Log.w(tag,msg,tr);
    }

    public static int w(String tag, Throwable tr) {
        return Log.w(tag,tr);
    }

    public static int e(String tag, String msg) {
        return Log.e(tag,msg);
    }

    public static int e(String tag, String msg, Throwable tr) {
        return Log.e(tag,msg,tr);
    }
}
