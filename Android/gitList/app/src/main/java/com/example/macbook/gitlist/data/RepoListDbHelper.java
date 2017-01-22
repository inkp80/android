/*
package com.example.macbook.gitlist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

*/
/**
 * Created by macbook on 2017. 1. 21..
 *//*


public class RepoListDbHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "repolist.db";
    private static final int DATABASE_VERSON = "1";

    public RepoListDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSON);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase){
        final String SQL_CREATE_REPOLIST_TABLE = "CREATE TABLE " + RepoListContract.RepoListEntry.TABLE_NAME + " (" +
                RepoListContract.RepoListEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                WaitlistEntry.COLUMN_GUEST_NAME + " TEXT NOT NULL, " +
                WaitlistEntry.COLUMN_PARTY_SIZE + " INTEGER NOT NULL, " +
                WaitlistEntry.COLUMN_TIMESTAMP + " TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                "); ";
    }

}
*/
