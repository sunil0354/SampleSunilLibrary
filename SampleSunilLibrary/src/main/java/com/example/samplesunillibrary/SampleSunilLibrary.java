package com.example.samplesunillibrary;

import android.content.Context;

public class SampleSunilLibrary {
    private static Context mContext;
    private static Toast toast;

    public static void initialise(Context context) {
        mContext = context;
    }

    public static void showToast(String message) throws Exception {
        if (mContext==null){
            throw new Exception();
        }
        if (toast == null) {
            toast = new Toast();
        }
        toast.showToast(mContext, message);
    }

    public static Context getInstance() {
        return mContext;
    }
}
