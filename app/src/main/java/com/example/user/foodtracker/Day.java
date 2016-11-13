package com.example.user.foodtracker;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class Day {
    private String date;
    private ArrayList<Meal> meals;

    public Day(String date) {
        this.date = date;
        this.meals = new ArrayList<Meal>();
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public int mealCount() {
        return meals.size();
    }
}
