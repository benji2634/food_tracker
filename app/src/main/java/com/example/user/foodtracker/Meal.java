package com.example.user.foodtracker;

import java.util.ArrayList;

/**
 * Created by user on 11/11/2016.
 */

public class Meal {
    private ArrayList<Food> foods;

    public Meal() {
        this.foods = new ArrayList<Food>();
    }

//    public Meal(ArrayList<String> existingMeal) {
//        mFood = new ArrayList<String>(existingMeal);
//    }

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
}




