package com.example.user.foodtracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 15/11/2016.
 */

public class DayActivity extends AppCompatActivity {

    TextView mDayInfoText;
    TextView mCalorieLimit;
    TextView mBreakfastFoods;
    TextView mLunchFoods;
    TextView mDinnerFoods;
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

        mCalorieLimit = (TextView) findViewById(R.id.calorie_limit);
        int calorieLimit = extras.getInt("calorie_limit");
        mCalorieLimit.setText(Integer.toString(calorieLimit));

        mBreakfastFoods = (TextView) findViewById(R.id.breakfast_foods);
        ArrayList<String> breakfastFoods = extras.getStringArrayList("breakfast_foods");
        String breakfastString = "";
        for (String food : breakfastFoods) {
            breakfastString += food + "\n";
        }
        mBreakfastFoods.setText(breakfastString);

        mLunchFoods = (TextView) findViewById(R.id.lunch_foods);
        ArrayList<String> lunchFoods = extras.getStringArrayList("lunch_foods");
        String lunchString = "";
        for (String food : lunchFoods) {
            lunchString += food + "\n";
        }
        mLunchFoods.setText(lunchString);

        mDinnerFoods = (TextView) findViewById(R.id.dinner_foods);
        ArrayList<String> dinnerFoods = extras.getStringArrayList("dinner_foods");
        String dinnerString = "";
        for (String food : dinnerFoods) {
            dinnerString += food + "\n";
        }
        mDinnerFoods.setText(dinnerString);

        mSnackFoods = (TextView) findViewById(R.id.snack_foods);
        ArrayList<String> snackFoods = extras.getStringArrayList("snack_foods");
        String snackString = "";
        for (String food : snackFoods) {
            snackString += food + "\n";
        }
        mSnackFoods.setText(snackString);
    }
}
