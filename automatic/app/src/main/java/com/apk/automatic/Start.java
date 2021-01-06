package com.apk.automatic;

import android.app.Activity;
import android.app.Application;
import com.apk.automatic.base.BasePlatform;
import com.apk.automatic.platform.InstagramePlatform;
import com.apk.automatic.platform.TestPlatform;

public class Start {

    public static BasePlatform platform;

    /**
     * Application OnCreate
     */
    public static void applicationOnCrateAfter(Application application){
        String packageName = application.getPackageName();
        if(packageName.equals(Constant.PACKAGE_INSTAGRAM)){
            platform = new InstagramePlatform(application);
        }else if(packageName.equals(Constant.PACKAGE_TEST)){
            platform = new TestPlatform(application);
        }
    }

    /**
     * Activity OnResume
     * @param activity
     */
    public static void activityOnResume(Activity activity){
        if(platform != null){
            platform.activityOnResume(activity);
        }
    }

    /**
     * Activity OnPause
     * @param activity
     */
    public static void activityOnPause(Activity activity){
        if(platform != null){
            platform.activityOnPause(activity);
        }
    }

}
