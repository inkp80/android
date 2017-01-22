package com.example.macbook.gitlist;

import android.net.Uri;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by macbook on 2017. 1. 21..
 */

public class NetworkUtils {

    final static String GITHUB_BASE_URL =
            "https://api.github.com/repos/jakewharton/butterknife/issues";
    //https://api.github.com/repos/jakewharton/butterknife/issues


    /**
     * Builds the URL used to query Github.
     *
     * @param githubSearchQuery The keyword that will be queried for.
     * @return The URL to use to query the weather server.
     */
    public static URL buildUrl() {
        Uri builtUri = Uri.parse(GITHUB_BASE_URL).buildUpon().build();

        URL url = null;
        try {
            url = new URL(builtUri.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return url;
    }


    public static ArrayList<IssueItem> getResponseFromHttpUrl(){
        return getList();
    }

    public static ArrayList<IssueItem> getList(){
        ArrayList<IssueItem> items = new ArrayList<>();

        try {
            String html = Jsoup.connect(GITHUB_BASE_URL).ignoreContentType(true).execute().body();
            JSONArray array = new JSONArray(html);

            for(int i = 0; i < array.length(); i++) {
                IssueItem item = new IssueItem();

                JSONObject jsonObject = array.getJSONObject(i);
                JSONObject user = jsonObject.getJSONObject("user");

                String title = jsonObject.getString("title");
                String profileUrl = user.getString("avatar_url");
                String userName = user.getString("login");

                item.setTitle(title);
                item.setProfileUrl(profileUrl);
                item.setUserName(userName);

                items.add(item);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return items;
    }


    public static class IssueItem {
        String profileUrl;
        String title;
        String userName;

        public String getProfileUrl() {
            return profileUrl;
        }

        public void setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }
}
