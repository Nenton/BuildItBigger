package com.nenton.imagelibrary;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ImageActivity extends AppCompatActivity {

    public static final String KEY_JOKE = "KEY_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            if (extras != null && extras.containsKey(KEY_JOKE)) {
                ((TextView) findViewById(R.id.image_text)).setText(extras.getString(KEY_JOKE));
            }
        }
    }

}
