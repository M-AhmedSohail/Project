package com.project.i200557_i200405_i200590;

import android.provider.BaseColumns;

public class MyJournalContract {

    public  static String DB_NAME= "myJournals.db";
    public  static  int DB_VERSION=1;

    public static class JournalEntries implements BaseColumns {

        public static String TABLENAME="journalsTable";
        public static String _TITLE="title";
        public static String _DESCRIPTION="description";
        public static String _DAY="day";
        public static String _DATE ="date";
        public static String _TIME= "time";
        public  static String _LOCATION= "location";

    }

}
