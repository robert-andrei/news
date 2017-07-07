package com.example.android.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
        titleView.setSelected(true);

        TextView sectionNameView = (TextView) convertView.findViewById(R.id.section_name);
        sectionNameView.setText(currentNews.getSectionName());

        TextView datePublishedView = (TextView) convertView.findViewById(R.id.date_published);
        datePublishedView.setText(formatDate(currentNews.getDatePublished()));

        return convertView;
    }

    private String formatDate (String stringDate) {

        String formattedDate = stringDate.substring(0, stringDate.indexOf('T')) + ", " +
                stringDate.substring(stringDate.indexOf('T') + 1, stringDate.length() - 1);

        return formattedDate;
    }
}
