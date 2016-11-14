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
    Meal entry4;
    Meal entry5;
    Meal entry6;
    Meal entry7;
    Meal entry8;


    @Before
    public void before() {
        day = new Day("Monday 14th November");
        entry1 = new Meal();
        entry2 = new Meal();
        entry3 = new Meal();
        entry4 = new Meal();
        entry5 = new Meal();
        entry6 = new Meal();
        entry7 = new Meal();
        entry8 = new Meal();
        day.addBreakfast(entry1);
        day.addLunch(entry3);
        day.addDinner(entry5);
        day.addSnack(entry7);
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
    public void canGetBreakfast() {
        assertEquals(entry1, day.getBreakfast());
    }

    @Test
    public void canAddBreakfast() {
        day.addBreakfast(entry2);
        assertEquals(2, day.breakfastCount());
    }

    @Test
    public void canAddLunch() {
        day.addLunch(entry4);
        assertEquals(2, day.lunchCount());
    }

    @Test
    public void canAddDinner() {
        day.addDinner(entry6);
        assertEquals(2, day.dinnerCount());
    }

    @Test
    public void canAddSnack() {
        day.addSnack(entry8);
        assertEquals(2, day.snackCount());
    }

    @Test
    public void canCountAllMeals() {
        assertEquals(4, day.countAllMeals());
    }

}
