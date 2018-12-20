package com.example.kienphung.lesson7;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.ViewHolder> {

    private List<Repo> mRepos;
    private LayoutInflater mLayoutInflater;

    public RepoAdapter(List<Repo> repos) {
        mRepos = repos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (mLayoutInflater == null) {
            mLayoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        View view = mLayoutInflater.inflate(R.layout.item_view, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bindData(mRepos.get(i));
    }

    @Override
    public int getItemCount() {
        return mRepos != null ? mRepos.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextViewId;
        private TextView mTextViewName;
        private TextView mTextViewUrl;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewId = itemView.findViewById(R.id.text_view_id);
            mTextViewName = itemView.findViewById(R.id.text_view_name);
            mTextViewUrl = itemView.findViewById(R.id.text_view_url);
        }

        public void bindData(Repo repo) {
            if (repo == null) return;
            mTextViewId.setText(repo.getId());
            mTextViewName.setText(repo.getName());
            mTextViewUrl.setText(repo.getHtmlUrl());
        }
    }
}
