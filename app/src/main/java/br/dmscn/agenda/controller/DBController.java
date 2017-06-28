package br.dmscn.agenda.controller;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBController {
    private SQLiteDatabase db;
    private DBHelper dbHelper;

    public DBController(Context context) {
        dbHelper = new DBHelper(context);
    }

    public static void newProfile(String name, String email, String username, String passoword) {
        // TODO
    }

    public static Boolean login(String username, String password) {
        // TODO
        return false;
    }
}
