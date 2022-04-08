package com.example.notify.databaseHandler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

import com.example.notify.Params.params;

public class DBhandler extends SQLiteOpenHelper{
    public DBhandler(@Nullable Context context) {
        super(context, params.DB_NAME ,null , params.DB_VER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }
}
