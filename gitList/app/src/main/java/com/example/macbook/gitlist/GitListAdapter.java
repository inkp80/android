package com.example.macbook.gitlist;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by macbook on 2017. 1. 21..
 */

public class GitListAdapter extends RecyclerView.Adapter<GitListAdapter.RepoListViewHolder>{

    private ArrayList<NetworkUtils.IssueItem> mIssueItem;
    private Context mContext;

    public GitListAdapter (Context context, ArrayList<NetworkUtils.IssueItem> issueItems){
        this.mContext = context;
        this.mIssueItem = issueItems;
    }

    @Override
    public RepoListViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.repo_list_item, parent, false);
        return new RepoListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RepoListViewHolder holder, int position){
        holder.titleTextView.setText(mIssueItem.get(position).getTitle());
        Picasso.with(mContext).load(mIssueItem.get(position).getProfileUrl()).into(holder.avtImgView);
    }

    @Override
    public int getItemCount() {
        return mIssueItem.size();
    }


    class RepoListViewHolder extends RecyclerView.ViewHolder {

        // Will display the guest name
        TextView titleTextView;
        // Will display the party size number
        ImageView avtImgView;

        public RepoListViewHolder(View itemView) {
            super(itemView);
            titleTextView = (TextView) itemView.findViewById(R.id.text_view_title);
            avtImgView = (ImageView) itemView.findViewById(R.id.img_view_avt);
        }

    }

}
