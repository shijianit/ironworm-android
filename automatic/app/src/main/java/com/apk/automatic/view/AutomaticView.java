package com.apk.automatic.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AutomaticView extends RelativeLayout {

    private static String TAG = "AutomaticView";

    public AutomaticView(Context context) {
        super(context);

        TextView tv = new TextView(context);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        params.addRule(RelativeLayout.CENTER_VERTICAL);
        tv.setLayoutParams(params);
        tv.setText("Test Add");
        tv.setTextSize(30);
        addView(tv);
    }

}
