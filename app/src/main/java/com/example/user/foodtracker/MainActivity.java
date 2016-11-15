package com.example.user.foodtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.*;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by user on 14/11/2016.
 */

public class MainActivity extends AppCompatActivity {

    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.my_listview);

        ArrayList<String> array = new ArrayList<String>();
        array.add("Tom");
        array.add("Dick");
        array.add("Harry");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array);

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = (String)mListView.getItemAtPosition(position);
                Log.d("ListView:", selected + " selected");
            }
        });
    }

   /* private ArrayList<String> setUpStringsList() {
        ArrayList<String> stringsList = new ArrayList<String>();

        String[] strings = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        for (int i = 0; i < strings.length; i++) {
            stringsList.add(strings[i]);
        }
        return stringsList;
    } */

}
