package com.example.macbook.gitlist;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;

import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.ProtectionDomain;
import java.util.ArrayList;

/**
 * Created by macbook on 2017. 1. 22..
 */

public class QueryAsyncTask extends AsyncTask<Void, Void, ArrayList<NetworkUtils.IssueItem>>{

    private RecyclerView recyclerView;

    public QueryAsyncTask(RecyclerView view){
        super();
        recyclerView = view;
    }

    @Override
    protected void onPreExecute(){
        super.onPreExecute();
    }

    @Override
    protected ArrayList<NetworkUtils.IssueItem> doInBackground(Void... Void){
        ArrayList<NetworkUtils.IssueItem> githubSearchResults = null;
        return githubSearchResults = NetworkUtils.getResponseFromHttpUrl();
    }

    @Override
    protected void onPostExecute(ArrayList<NetworkUtils.IssueItem> githubSearchResult){
        recyclerView.setAdapter(new GitListAdapter(recyclerView.getContext(), githubSearchResult));

    }
    /*@Override
    protected void onPostExecute(ArrayList<NetworkUtils> githubSearchResults) {
        if (githubSearchResults != null && !githubSearchResults.equals("")) {
            for(NetworkUtils.IssueItem datas : githubSearchResults)
        } else {
            mTextView.setText("No Data");
        }
    }*/
}
