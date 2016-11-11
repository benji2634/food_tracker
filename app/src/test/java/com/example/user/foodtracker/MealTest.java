package com.example.user.foodtracker;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/11/2016.
 */

public class MealTest {

    Meal meal;
    Food toast;
    Food apple;
    Food milk;

    @Before
    public void before() {
        meal = new Meal();
        toast = new Food("toast", 93);
    }

    @Test
    public void canAddFoodToMeal() {
        meal.add(toast);
        assertEquals(1, meal.foodCount());
    }


}
