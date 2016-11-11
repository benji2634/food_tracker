package com.example.user.foodtracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 11/11/2016.
 */

public class FoodTest {

    Food food;

    @Before
    public void before() {
     food = new Food("Big Mac", 489);
    }

    @Test
    public void canGetName() {
        assertEquals("Big Mac", food.getName());
    }

    @Test
    public void canGetCalories() {
        assertEquals(489, food.getCalories());
    }
}
