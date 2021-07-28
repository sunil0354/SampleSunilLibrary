package com.example.samplesunillibrary;

import android.content.Context;

public class SampleSunilLibrary {
    private static Context mContext;
    private static Toast toast;
    private static Logs mLogs;

    public static void initialise(Context context) {
        mContext = context;
    }

    public static void showToast(String message) throws Exception {
        mLogs = new Logs();
        if (mContext == null) {
            mLogs.e("Context is null");
            throw new Exception();
        }
        if (toast == null) {
            mLogs.e("Toast is null");
            toast = new Toast();
        }
        toast.showToast(mContext, message);
    }

    public static Context getInstance() {
        return mContext;
    }
}
