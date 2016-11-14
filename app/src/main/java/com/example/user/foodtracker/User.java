package com.example.user.foodtracker;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 13/11/2016.
 */

public class User {
    private String name;
    private int age;
    private ArrayList<Day> days;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.days = new ArrayList<Day>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
