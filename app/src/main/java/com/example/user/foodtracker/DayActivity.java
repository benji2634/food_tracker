package com.example.user.foodtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.*;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 15/11/2016.
 */

public class DayActivity extends AppCompatActivity {

    TextView mDayInfoText;
    TextView mBreakfastHeader;
    TextView mBreakfastFoods;
    TextView mLunchHeader;
    TextView mLunchFoods;
    TextView mDinnerHeader;
    TextView mDinnerFoods;
    TextView mSnackHeader;
    TextView mSnackFoods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        android.util.Log.d("Food Tracker", "DayActivity onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);

        mDayInfoText = (TextView) findViewById(R.id.day_info_text);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String date = extras.getString("date");
        mDayInfoText.setText(date);

        mBreakfastHeader = (TextView) findViewById(R.id.breakfast_header);

        mBreakfastFoods = (TextView) findViewById(R.id.breakfast_foods);
        ArrayList<String> breakfastFoods = extras.getStringArrayList("breakfast_foods");
        mBreakfastFoods.setText(breakfastFoods.get(0));

        mLunchHeader = (TextView) findViewById(R.id.lunch_header);

        mLunchFoods = (TextView) findViewById(R.id.lunch_foods);
        String lunchFoods = extras.getString("lunch_foods");
        mLunchFoods.setText(lunchFoods);

        mDinnerHeader = (TextView) findViewById(R.id.dinner_header);

        mDinnerFoods = (TextView) findViewById(R.id.dinner_foods);
        String dinnerFoods = extras.getString("dinner_foods");
        mDinnerFoods.setText(dinnerFoods);

        mSnackHeader = (TextView) findViewById(R.id.snack_header);

        mSnackFoods = (TextView) findViewById(R.id.snack_foods);
        String snackFoods = extras.getString("snack_foods");
        mSnackFoods.setText(snackFoods);
    }
}
