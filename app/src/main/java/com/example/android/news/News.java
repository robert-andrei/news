package com.example.android.news;

/**
 * Created by Joker on 7/5/2017.
 */

public class News {

    private final String mTitle;
    private final String mSectionName;
    private final String mDatePublished;
    private final String mUrl;

    public News(String title, String sectionName, String datePublished, String url) {
        this.mTitle = title;
        this.mSectionName = sectionName;
        this.mDatePublished = datePublished;
        this.mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getDatePublished() {
        return mDatePublished;
    }

    public String getUrl() {
        return mUrl;
    }
}
