package com.example.user.foodtracker;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserInfoText = (TextView) findViewById(R.id.user_info_text);

        mDaysListView = (ListView)findViewById(R.id.my_days_listview);

        User user = new User("Alex", 35);
        Day day1 = new Day("Monday 14th November", 2800);
        Day day2 = new Day("Tuesday 15th November", 2300);
        Day day3 = new Day("Wednesday 16th November", 2300);
        Day day4 = new Day("Thursday 17th November", 2300);
        Day day5 = new Day("Friday 18th November", 2800);
        Day day6 = new Day("Saturday 19th November", 2300);
        Day day7 = new Day("Sunday 20th November", 2300);
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
                String selected = (String)mDaysListView.getItemAtPosition(position);
                Log.d("ListView:", selected + " selected");
            }
        });
    }

}
