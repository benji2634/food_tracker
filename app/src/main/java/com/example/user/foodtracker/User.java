package com.example.user.foodtracker;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 13/11/2016.
 */

public class User {
    private String name;
    private ArrayList<Day> days;

    public User(String name) {
        this.name = name;
        this.days = new ArrayList<Day>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Day> getDays() {
        return this.days;
    }

    public void addDay(Day day) {
        days.add(day);
    }

    public int dayCount() {
        return days.size();
    }

}
