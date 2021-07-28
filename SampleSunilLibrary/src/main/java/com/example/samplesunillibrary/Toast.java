package com.example.samplesunillibrary;

import android.content.Context;

public class Toast {
    protected void showToast(Context c, String message) {
        android.widget.Toast.makeText(c, message, android.widget.Toast.LENGTH_SHORT).show();
    }
}
