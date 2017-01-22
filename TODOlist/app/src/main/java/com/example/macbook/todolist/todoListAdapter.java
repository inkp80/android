package com.example.macbook.todolist;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

/**
 * Created by macbook on 2017. 1. 21..
 */

public class todoListAdapter extends CursorAdapter{

    public todoListAdapter(Context context, Cursor cursor, int flag){
        super(context, cursor, flag);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return null;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

    }
}
