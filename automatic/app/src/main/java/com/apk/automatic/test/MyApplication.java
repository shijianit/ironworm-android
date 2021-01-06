package com.apk.automatic.test;

import android.app.Application;

import com.apk.automatic.Start;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Start.applicationOnCrateAfter(this);
    }
}
