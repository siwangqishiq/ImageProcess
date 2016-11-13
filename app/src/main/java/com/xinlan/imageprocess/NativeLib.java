package com.xinlan.imageprocess;


import android.graphics.Bitmap;

/**
 * Created by panyi on 16/11/13.
 */

public class NativeLib {
    static {
        System.loadLibrary("panyi");
    }

    public static native void process(Bitmap srcBitmap,int width,int height);
}
