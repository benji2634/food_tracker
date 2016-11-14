package com.example.user.foodtracker;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/11/2016.
 */

public class UserTest {
    User user;
    Day day1;
    Day day2;
    Meal meal1;
    Meal meal2;
    Food entry1;
    Food entry2;

    @Before
    public void before() {
        user = new User("Alex", 35);
        entry1 = new Food("toast", 93);
        entry2 = new Food("apple", 75);
        meal1 = new Meal();
        meal1.addFood(entry1);
        meal2 = new Meal();
        meal2.addFood(entry2);
        day1 = new Day("Monday");
        day1.addBreakfast(meal1);
        day2 = new Day("Tuesday");
        day2.addLunch(meal2);
        user.addDay(day1);
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
    public void canGetAge() {
        assertEquals(35, user.getAge());
    }

    @Test
    public void canSetAge() {
        user.setAge(36);
        assertEquals(36, user.getAge());
    }

    @Test
    public void canGetDays() {
        assertEquals(day1, user.getDays().get(0));
    }

    @Test
    public void canAddDay() {
        user.addDay(day2);
        assertEquals(2, user.dayCount());
    }

//    @Test
//    public void canAddFoodToMealAndGetTotalCalories() {
//        user.addFoodToMeal(food);
//        assertEquals(734, user.getTotalCalories());
//    }
}
