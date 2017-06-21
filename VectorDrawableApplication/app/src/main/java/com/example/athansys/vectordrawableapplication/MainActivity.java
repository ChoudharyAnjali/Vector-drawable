package com.example.athansys.vectordrawableapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.content.res.AppCompatResources;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        mTextView = (TextView) findViewById(R.id.testing_text_view);
        Drawable vectorDrawable = AppCompatResources.getDrawable(this, R.drawable.ic_camera_black_24dp);
        //mTextView.setCompoundDrawables(vectorDrawable, null, null, null);
        mTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(vectorDrawable, null, null, null);
        //imageView.setImageDrawable(vectorDrawable);
    }
}
