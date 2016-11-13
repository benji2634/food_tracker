package com.example.user.foodtracker;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class DayTest {
    Day day;
    Meal entry1;
    Meal entry2;
    Meal entry3;

    @Before
    public void before() {
        day = new Day("Monday 14th November");
        entry1 = new Meal();
        entry2 = new Meal();
        day.addMeal(entry1);
        day.addMeal(entry2);
    }

    @Test
    public void canGetName() {
        Assert.assertEquals("Monday 14th November", day.getDate());
    }

    @Test
    public void canSetName() {
        day.setDate("Tuesday 15th November");
        Assert.assertEquals("Tuesday 15th November", day.getDate());
    }

    @Test
    public void canAddMeal() {
        day.addMeal(entry3);
        assertEquals(3, day.mealCount());
    }

}
