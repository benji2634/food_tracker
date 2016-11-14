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
    Meal breakfast;
    Meal lunch;
    Meal dinner;
    Meal snack;

    @Before
    public void before() {
        day = new Day("Monday 14th November");

        breakfast = new Meal();
        Food breakfastEntry = new Food("apple", 75);
        breakfast.addFood(breakfastEntry);
        day.addBreakfast(breakfast);

        lunch = new Meal();
        Food lunchEntry = new Food("chicken wrap", 264);
        lunch.addFood(lunchEntry);
        day.addLunch(lunch);

        dinner = new Meal();
        Food dinnerEntry = new Food("spaghetti bolognese", 512);
        dinner.addFood(dinnerEntry);
        day.addDinner(dinner);

        snack = new Meal();
        Food snackEntry = new Food("yoghurt", 101);
        snack.addFood(snackEntry);
        day.addSnack(snack);
    }

    @Test
    public void canGetDate() {
        Assert.assertEquals("Monday 14th November", day.getDate());
    }

    @Test
    public void canSetDate() {
        day.setDate("Tuesday 15th November");
        Assert.assertEquals("Tuesday 15th November", day.getDate());
    }

    @Test
    public void canGetBreakfast() {
        assertEquals(breakfast, day.getBreakfast());
    }

    @Test
    public void canAddMoreFoodToBreakfast() {
        Food breakfastEntry2 = new Food("Muesli", 243);
        day.getBreakfast().addFood(breakfastEntry2);
        assertEquals(2, day.breakfastCount());
    }

    @Test
    public void canGetLunch() {
        assertEquals(lunch, day.getLunch());
    }

    @Test
    public void canAddMoreFoodToLunch() {
        Food lunchEntry2 = new Food("protein bar", 199);
        day.getLunch().addFood(lunchEntry2);
        assertEquals(2, day.lunchCount());
    }

    @Test
    public void canGetDinner() {
        assertEquals(dinner, day.getDinner());
    }

    @Test
    public void canAddMoreFoodToDinner() {
        Food dinnerEntry2 = new Food("chicken wings", 415);
        day.getDinner().addFood(dinnerEntry2);
        assertEquals(2, day.dinnerCount());
    }

    @Test
    public void canGetSnack() {
        assertEquals(snack, day.getSnack());
    }

    @Test
    public void canAddMoreFoodToSnack() {
        Food snackEntry2 = new Food("almonds", 102);
        day.getSnack().addFood(snackEntry2);
        assertEquals(2, day.snackCount());
    }

    @Test
    public void canCountAllMeals() {
        assertEquals(4, day.mealCount());
    }

    @Test
    public void canCountTotalCaloriesForADay() {
        assertEquals(952, day.calorieCount());
    }

}
