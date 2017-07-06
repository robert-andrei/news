package com.example.android.news;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Joker on 7/5/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        News currentNews = getItem(position);

        TextView titleView = (TextView) convertView.findViewById(R.id.title);
        titleView.setText(currentNews.getTitle());

        TextView sectionNameView = (TextView) convertView.findViewById(R.id.section_name);
        sectionNameView.setText(currentNews.getSectionName());

        TextView datePublishedView = (TextView) convertView.findViewById(R.id.date_published);
        datePublishedView.setText(currentNews.getDatePublished());

        Log.i("TEST", formateDate("2017-02-06T07:00:20Z").toString());

        return convertView;
    }

    private Date formateDate (String stringDate) {

        SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy");
        Date date;
        try {
            date = df.parse(stringDate);
        } catch (ParseException e) {
            Log.e("NewsAdapter", "Error parsing date");
            return null;
        }

        return date;
    }
}
