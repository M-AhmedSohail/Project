package com.project.i200557_i200405_i200590;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDBHelper extends SQLiteOpenHelper {


    private static final String CREATE_JOURNAL_TABLE =
            "CREATE TABLE " + MyJournalContract.JournalEntries.TABLENAME + " (" +
                    MyJournalContract.JournalEntries._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    MyJournalContract.JournalEntries._TITLE + " TEXT NOT NULL," +
                    MyJournalContract.JournalEntries._DESCRIPTION + " TEXT," +
                    MyJournalContract.JournalEntries._DAY + " TEXT," +
                    MyJournalContract.JournalEntries._DATE + " TEXT," +
                    MyJournalContract.JournalEntries._TIME + " TEXT," +
                    MyJournalContract.JournalEntries._LOCATION + " TEXT)";

    String DELETE_ITEMS_TABLE="DROP TABLE IF EXISTS " + MyJournalContract.JournalEntries.TABLENAME;
    public MyDBHelper(@Nullable Context context) {


        super(context, MyJournalContract.DB_NAME, null, MyJournalContract.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_JOURNAL_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DELETE_ITEMS_TABLE);
        onCreate(db);

    }
}
