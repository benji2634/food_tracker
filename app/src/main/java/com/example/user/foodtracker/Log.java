package com.example.user.foodtracker;

import java.util.ArrayList;

/**
 * Created by user on 13/11/2016.
 */

public class Log {
    private ArrayList<String> messages;

    public Log() {
        this.messages = new ArrayList<String>();
    }

    public void add(String string) {
        messages.add(string);
    }

    public void print() {
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
