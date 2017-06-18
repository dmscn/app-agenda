import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dmscn on 16/06/17.
 */

public class DBHelper { //extends SQLiteOpenHelper {

    /*
    public static final String DB_NAME = "agenda.db";
    public static final int VERSION = 1;

    // profile table
    public static final String PROFILE_TABLE = "profile";
    public static final String PROFILE_ID = "_id";
    public static final String PROFILE_NAME = "name";
    public static final String PROFILE_USERNAME = "username";
    public static final String PROFILE_PASSWORD = "password";

    // event table
    public static final String EVENT_TABLE = "event";
    public static final String EVENT_ID = "_id";
    public static final String EVENT_TITLE = "title";
    public static final String EVENT_DATE = "date";
    public static final String EVENT_LOCAL = "local";
    public static final String EVENT_DESCRIPTION = "description";

    // contact table
    public static final String CONTACT_TABLE = "contact";
    public static final String CONTACT_ID = "_id";
    public static final String CONTACT_NAME = "name";
    public static final String CONTACT_EMAIL = "email";

    // phone table
    public static final String PHONE_TABLE = "phone";
    public static final String PHONE_ID = "_id";
    public static final String PHONE_CONTACT = "contact"; // fk
    public static final String PHONE_NUMBER = "number";

    // task table
    public static final String TASK_TABLE = "task";
    public static final String TASK_ID = "_id";
    public static final String TASK_TITLE = "title";
    public static final String TASK_LABEL = "label";
    public static final String TASK_DATE = "date";

    // subtask table
    public static final String SUBTASK_TABLE = "subtask";
    public static final String SUBTASK_ID = "_id";
    public static final String SUBTASK_DESCRIPTION = "description";
    public static final String SUBTASK_TASK = "task";

    // notification table
    public static final String NOTIFICATION_TABLE = "notification";
    public static final String NOTIFICATION_ID = "_id";
    public static final String NOTIFICATION_EVENT = "event"; // fk
    public static final String NOTIFICATION_TASK = "task";   // fk
    public static final String NOTIFICATION_TIME = "time";

    // label table
    public static final String LABEL_TABLE = "label";
    public static final String LABEL_ID = "_id";
    public static final String LABEL_DESCRIPTION = "description";

    // queries
    private static final String PROFILE_CREATE_TABLE = "CREATE TABLE "
            + PROFILE_TABLE + " ("
            + PROFILE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PROFILE_NAME + " TEXT NOT NULL, "
            + PROFILE_USERNAME + " TEXT NOT NULL, "
            + PROFILE_PASSWORD + " TEXT NOT NULL);";

    private static final String EVENT_CREATE_TABLE = "CREATE TABLE "
            + EVENT_TABLE + " ("
            + EVENT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + EVENT_TITLE + " TEXT, "
            + EVENT_DATE + " TEXT, "
            + EVENT_LOCAL + " TEXT, "
            + EVENT_DESCRIPTION + " TEXT);";

    private static final String CONTACT_CREATE_TABLE = "CREATE TABLE "
            + CONTACT_TABLE + " ("
            + CONTACT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CONTACT_NAME + " TEXT, "
            + CONTACT_EMAIL + " TEXT);";

    private static final String TASK_CREATE_TABLE = "CREATE TABLE "
            + TASK_TABLE + " ("
            + TASK_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + TASK_TITLE + " TEXT, "
            + TASK_DATE + " TEXT, "
            + TASK_LABEL + " INTEGER, "
            + "FOREIGN KEY (" + TASK_LABEL + ") REFERENCES " + LABEL_TABLE + "(" + LABEL_ID + "));";

    private static final String NOTIFICATION_CREATE_TABLE = "CREATE TABLE "
            + NOTIFICATION_TABLE + " ("
            + NOTIFICATION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + NOTIFICATION_TIME + " TEXT, "
            + NOTIFICATION_EVENT + " INTEGER ,"
            + NOTIFICATION_TASK + " INTEGER , "
            + " FOREIGN KEY (" + NOTIFICATION_EVENT + ") REFERENCES + " + EVENT_TABLE + "(" + EVENT_ID + "), "
            + " FOREIGN KEY (" + NOTIFICATION_TASK + ") REFERENCES + " + TASK_TABLE + "(" + TASK_ID + "));";

    private static final String PHONE_CREATE_TABLE = "CREATE TABLE "
            + PHONE_TABLE + " ("
            + PHONE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + PHONE_NUMBER + " TEXT, "
            + PHONE_CONTACT + " INTEGER, "
            + "FOREIGN KEY (" + PHONE_CONTACT + ") REFERENCES " + CONTACT_TABLE + "(" + CONTACT_ID + "));";

    private static final String SUBTASK_CREATE_TABLE = "CREATE TABLE "
            + SUBTASK_TABLE + " ("
            + SUBTASK_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + SUBTASK_DESCRIPTION + " TEXT, "
            + SUBTASK_TASK + " INTEGER, "
            + "FOREIGN KEY (" + SUBTASK_TASK + ") REFERENCES " + TASK_TABLE + "(" + TASK_ID + "));";

    private static final String LABEL_CREATE_TABLE = "CREATE TABLE "
            + LABEL_TABLE + " ("
            + LABEL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + LABEL_DESCRIPTION + " TEXT);";


    public DBHelper (Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    */
}
