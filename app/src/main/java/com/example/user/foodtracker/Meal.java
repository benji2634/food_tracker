package com.example.user.foodtracker;

import java.util.ArrayList;

/**
 * Created by user on 11/11/2016.
 */

public class Meal {
    protected ArrayList<Food> mFood;

    public Meal() {
        mFood = new ArrayList<Food>();
    }

//    public Meal(ArrayList<String> existingMeal) {
//        mFood = new ArrayList<String>(existingMeal);
//    }

    public void add(Food food) {
        mFood.add(food);
    }

    public int foodCount() {
        return mFood.size();
    }




}
