package com.apk.automatic.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.apk.automatic.R;
import com.apk.automatic.Start;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Start.activityOnCreateAfter(this);
    }
}