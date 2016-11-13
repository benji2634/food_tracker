package com.example.user.foodtracker;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/11/2016.
 */

public class MealTest {

    Meal meal;
    Food entry1;
    Food entry2;
    Food entry3;

    @Before
    public void before() {
        meal = new Meal();
        entry1 = new Food("toast", 93);
        entry2 = new Food("apple", 75);
        meal.addFood(entry1);
        meal.addFood(entry2);
    }

    @Test
    public void canAddFood() {
        meal.addFood(entry3);
        assertEquals(3, meal.foodCount());
    }

    @Test
    public void canGetTotalCalories() {
        assertEquals(168, meal.getTotalCalories());
}
}
