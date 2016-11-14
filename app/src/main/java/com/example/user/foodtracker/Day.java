package com.example.user.foodtracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by user on 13/11/2016.
 */

public class Day {
    private String date;
    private HashMap<String, Meal> day;
//    private ArrayList<Meal> breakfast;
//    private ArrayList<Meal> lunch;
//    private ArrayList<Meal> dinner;
//    private ArrayList<Meal> snack;

    public Day(String date) {
        this.date = date;
        this.day = new HashMap<>();
//        this.breakfast = new ArrayList<Meal>();
//        this.lunch = new ArrayList<Meal>();
//        this.dinner = new ArrayList<Meal>();
//        this.snack = new ArrayList<Meal>();
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Meal getBreakfast() {
        return this.day.get("Breakfast");
    }

    public void addBreakfast(Meal meal) {
        day.put("Breakfast", meal);
    }

    public int breakfastCount() {
        Meal result = getBreakfast();
        return result.foodCount();
    }

    public Meal getLunch() {
        return this.day.get("Lunch");
    }

    public void addLunch(Meal meal) {
        day.put("Lunch", meal);
    }

    public int lunchCount() {
        Meal result = getLunch();
        return result.foodCount();
    }

    public Meal getDinner() {
        return this.day.get("Dinner");
    }

    public void addDinner(Meal meal) {
        day.put("Dinner", meal);
    }

    public int dinnerCount() {
        Meal result = getDinner();
        return result.foodCount();
    }

    public Meal getSnack() {
    return this.day.get("Snack");
}

    public void addSnack(Meal meal) {
        day.put("Snack", meal);
    }

    public int snackCount() {
        Meal result = getSnack();
        return result.foodCount();
    }
//
//    public int countAllMeals() {
//        int total = breakfast.size() + lunch.size() + dinner.size() + snack.size();
//        return total;
//    }
}
