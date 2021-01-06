package com.apk.automatic.platform;

import android.app.Activity;
import android.app.Application;

import com.apk.automatic.base.BasePlatform;

public class TestPlatform extends BasePlatform {

    public TestPlatform(Application application) {
        super(application);
    }

    @Override
    public void activityOnResume(Activity activity) {

    }

    @Override
    public void activityOnPause(Activity activity) {

    }

}
