package com.example.kienphung.lesson7;

public class Repo {
    private String mId;
    private String mName;
    private String mHtmlUrl;

    public Repo(String id, String name, String url) {
        mId = id;
        mName = name;
        mHtmlUrl = url;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }
}
