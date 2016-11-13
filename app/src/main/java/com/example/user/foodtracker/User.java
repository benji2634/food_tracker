package com.example.user.foodtracker;

/**
 * Created by user on 13/11/2016.
 */

public class User {
    private String name;
    private Meal meal;

    public User(String name, Meal meal) {
        this.name = name;
        this.meal = meal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFoodToMeal(Food food) {
        meal.addFood(food);
    }


    public int getTotalCalories() {
        return meal.getTotalCalories();
    }
}
