package com.example.macbook.gitlist.data;

import android.provider.BaseColumns;

/**
 * Created by macbook on 2017. 1. 21..
 */

public class RepoListContract {
    public static final class RepoListEntry implements BaseColumns{
        public static final String TABLE_NAME = "repolist";
        public static final String COLUMN_USERID = "user_id";
        public static final String COLUMN_URL = "repo_url";
        public static final String COLUMN_AVT_URL = "repo_avt_url";
    }
}
