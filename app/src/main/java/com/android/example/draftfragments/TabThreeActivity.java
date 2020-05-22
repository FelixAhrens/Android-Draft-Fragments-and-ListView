package com.android.example.draftfragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class TabThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new TabThreeFragment())
                .commit();
    }
}