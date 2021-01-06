package com.apk.automatic.base;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public abstract class BasePlatform {

    Application application;

    public BasePlatform(Application application){
        this.application = application;
    }

    public abstract void activityOnResume(Activity activity);

    public abstract void activityOnPause(Activity activity);

    public void addView(Activity activity, View view){
        FrameLayout frameLayout = getRootFrameLayout(activity);
        if(frameLayout != null){
            frameLayout.addView(view);
        }
    }

    public void removeView(Activity activity, View view){
        FrameLayout frameLayout = getRootFrameLayout(activity);
        if(frameLayout != null){
            frameLayout.removeView(view);
        }
    }

    public FrameLayout getRootFrameLayout(Activity activity){
        ViewGroup decorView = (ViewGroup) activity.getWindow().getDecorView();
        LinearLayout contentRoot = (LinearLayout) decorView.getChildAt(0);

        FrameLayout frameLayout = null;
        for(int i=contentRoot.getChildCount()-1; i >= 0; i--){
            Object obj = contentRoot.getChildAt(i);
            if(obj instanceof FrameLayout){
                frameLayout = (FrameLayout) obj;
                break;
            }
        }
        if(frameLayout == null){
            Toast.makeText(activity, "not found FrameLayout",Toast.LENGTH_SHORT).show();
            return null;
        }
        return frameLayout;
    }

}
