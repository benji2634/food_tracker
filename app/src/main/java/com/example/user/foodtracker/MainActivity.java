package com.example.user.foodtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.*;

/**
 * Created by user on 14/11/2016.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        android.util.Log.d("MainActivity", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
