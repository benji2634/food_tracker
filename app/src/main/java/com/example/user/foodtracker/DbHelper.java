package com.example.user.foodtracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by user on 16/11/2016.
 */

public class DbHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Database.db";
    private static final String TEXT_TYPE = " TEXT";
    private static final String INTEGER_TYPE = " INTEGER";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DbContract.FoodEntry.FOODS + " (" +
                    DbContract.FoodEntry._ID + " INTEGER PRIMARY KEY," +
                    DbContract.FoodEntry.NAME + TEXT_TYPE + COMMA_SEP +
                    DbContract.FoodEntry.CALORIES + INTEGER_TYPE + " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DbContract.FoodEntry.FOODS;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    // Add a new row to the database
    public void addFood(Food food) {
        ContentValues values = new ContentValues();
        values.put(DbContract.FoodEntry.NAME, food.getName());
        values.put(DbContract.FoodEntry.CALORIES, food.getCalories());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(DbContract.FoodEntry.FOODS, null, values);
        db.close();
    }

    public void deleteFood(String foodName) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + DbContract.FoodEntry.NAME + "WHERE " + DbContract.FoodEntry.NAME + "=\"" + foodName + "\";" );
    }
}
