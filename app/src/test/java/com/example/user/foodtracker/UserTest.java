package com.example.user.foodtracker;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class UserTest {
    User user;
    Food food;

    @Before
    public void before() {
        user = new User("Alex", new Meal());
        food = new Food("Pizza", 734);
    }

    @Test
    public void canGetName() {
        assertEquals("Alex", user.getName());
    }

    @Test
    public void canSetName() {
        user.setName("Ross");
        assertEquals("Ross", user.getName());
    }

    @Test
    public void canAddFoodToMealAndGetTotalCalories() {
        user.addFoodToMeal(food);
        assertEquals(734, user.getTotalCalories());
    }
}
