package com.example.user.foodtracker;

import java.util.ArrayList;

import static android.R.id.message;

/**
 * Created by user on 11/11/2016.
 */

public class Meal {
    private ArrayList<Food> foods;

    public Meal() {
        this.foods = new ArrayList<Food>();
    }

    public ArrayList<Food> getFoods() {
        return this.foods;
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public int foodCount() {
        return foods.size();
    }

    public int getTotalCalories() {
        int total = 0;
        for (Food food : foods) {
            total += food.getCalories();
        }
        return total;
    }

    @Override
    public String toString() {
        String message = "";
        for (Food food : foods) {
            message += food + ", ";
        }
        String result = message.substring(0, message.length() - 2);
        return result;
    }
}




