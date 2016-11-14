package com.example.user.foodtracker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 13/11/2016.
 */

public class Day {
    private String date;
    private ArrayList<Meal> breakfast;
    private ArrayList<Meal> lunch;
    private ArrayList<Meal> dinner;
    private ArrayList<Meal> snack;

    public Day(String date) {
        this.date = date;
        this.breakfast = new ArrayList<Meal>();
        this.lunch = new ArrayList<Meal>();
        this.dinner = new ArrayList<Meal>();
        this.snack = new ArrayList<Meal>();
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Meal> getBreakfast() {
        return this.breakfast;
    }

    public void addBreakfast(Meal meal) {
        breakfast.add(meal);
    }

    public int breakfastCount() {
        return breakfast.size();
    }

//    public String displayBreakfast() {
//        for (int i = 0; i < breakfast.size(); i++) {
//            Meal myBreakfast = breakfast.get(i);
//            return "Breakfast: " + myBreakfast.toString();
//        }
//        return null;
//    }

    public void addLunch(Meal meal) {
        lunch.add(meal);
    }

    public int lunchCount() {
        return lunch.size();
    }

    public void addDinner(Meal meal) {
        dinner.add(meal);
    }

    public int dinnerCount() {
        return dinner.size();
    }

    public void addSnack(Meal meal) {
        snack.add(meal);
    }

    public int snackCount() {
        return snack.size();
    }

    public int countAllMeals() {
        int total = breakfast.size() + lunch.size() + dinner.size() + snack.size();
        return total;
    }
}
