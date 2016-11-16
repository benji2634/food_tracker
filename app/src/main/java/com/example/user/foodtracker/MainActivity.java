package com.example.user.foodtracker;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.*;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class MainActivity extends AppCompatActivity {

    TextView mUserInfoText;
    ListView mDaysListView;

    User user;
    String date;
    int calorieLimit;
    String foods;
    Meal breakfast;
    Meal lunch;
    Meal dinner;
    Meal snack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DbHelper dbHelper = new DbHelper(this);
//        SQLiteDatabase db = dbHelper.getWritableDatabase();

        mUserInfoText = (TextView) findViewById(R.id.user_info_text);

        user = new User("Alex", 35);
        String userInfo = user.toString();
        mUserInfoText.setText(userInfo);

        mDaysListView = (ListView)findViewById(R.id.my_days_listview);

        Day day1 = new Day("Monday 14th November", 2800);
        Day day2 = new Day("Tuesday 15th November", 2300);
        Day day3 = new Day("Wednesday 16th November", 2300);
        Day day4 = new Day("Thursday 17th November", 2300);
        Day day5 = new Day("Friday 18th November", 2800);
        Day day6 = new Day("Saturday 19th November", 2300);
        Day day7 = new Day("Sunday 20th November", 2300);

        breakfast = new Meal();
        Food breakfastEntry1 = new Food("porridge", 289);
        breakfast.addFood(breakfastEntry1);
        Food breakfastEntry2 = new Food("orange juice", 87);
        breakfast.addFood(breakfastEntry2);
        day1.addBreakfast(breakfast);

        lunch = new Meal();
        Food lunchEntry = new Food("chicken wrap", 264);
        lunch.addFood(lunchEntry);
        day1.addLunch(lunch);

        dinner = new Meal();
        Food dinnerEntry = new Food("spaghetti bolognese", 512);
        dinner.addFood(dinnerEntry);
        day1.addDinner(dinner);

        snack = new Meal();
        Food snackEntry = new Food("yoghurt", 101);
        snack.addFood(snackEntry);
        day1.addSnack(snack);

        user.addDay(day1);
        user.addDay(day2);
        user.addDay(day3);
        user.addDay(day4);
        user.addDay(day5);
        user.addDay(day6);
        user.addDay(day7);

        ArrayList<String> days = user.getDateString();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, days);

        mDaysListView.setAdapter(adapter);

        mDaysListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String selected = (String)mDaysListView.getItemAtPosition(position);
//                Log.d("DaysListView:", selected + " selected");
                Log.d("DayListView:", Integer.toString(position));

                date = user.getDays().get(position).getDate();
                calorieLimit = user.getDays().get(position).getCalorieLimit();

                ArrayList<String> breakfastFoods = new ArrayList<String>();
                for(Food food : user.getDays().get(position).getBreakfast().getFoods()){
                    breakfastFoods.add(food.toString());
                }

                ArrayList<String> lunchFoods = new ArrayList<String>();
                for(Food food : user.getDays().get(position).getLunch().getFoods()){
                    lunchFoods.add(food.toString());
                }

                ArrayList<String> dinnerFoods = new ArrayList<String>();
                for(Food food : user.getDays().get(position).getDinner().getFoods()){
                    dinnerFoods.add(food.toString());
                }

                ArrayList<String> snackFoods = new ArrayList<String>();
                for(Food food : user.getDays().get(position).getSnack().getFoods()){
                    snackFoods.add(food.toString());
                }

                foods = user.getDays().get(position).getDay().toString();

                Intent intent = new Intent(MainActivity.this, DayActivity.class);
                intent.putExtra("date", date);
                intent.putExtra("calorie_limit", calorieLimit);
                intent.putStringArrayListExtra("breakfast_foods", breakfastFoods);
                intent.putStringArrayListExtra("lunch_foods", lunchFoods);
                intent.putStringArrayListExtra("dinner_foods", dinnerFoods);
                intent.putStringArrayListExtra("snack_foods", snackFoods);
                startActivity(intent);

            }
        });
    }

}
