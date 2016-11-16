package com.example.user.foodtracker;

import android.provider.BaseColumns;

/**
 * Created by user on 16/11/2016.
 */

public final class DbContract {
    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private DbContract() {}

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "foods";
        public static final String CALORIES = "calories";
        public static final String NAME = "name";
    }
}
