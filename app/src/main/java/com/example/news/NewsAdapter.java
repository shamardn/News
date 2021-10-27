package com.example.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<Story> {

    private final static String SEPARATOR = "T";

    public NewsAdapter(@NonNull Context context, @NonNull List<Story> stories) {
        super(context, 0, stories);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Story newStory = getItem(position);

        TextView section = (TextView) view.findViewById(R.id.section);
        section.setText(newStory.getSection());

        String mTime = newStory.getTime();
        String date;
        String time;

        if (mTime.contains(SEPARATOR)) {
            String[] parts = mTime.split(SEPARATOR);
            date = parts[0];
            String tTime = parts[1];
            time = tTime.substring(0, tTime.length() - 1);

        } else {
            date = "someDate";
            time = "once";
        }

        TextView dateView = (TextView) view.findViewById(R.id.date);
        dateView.setText(date);

        TextView timeView = (TextView) view.findViewById(R.id.time);
        timeView.setText(time);

        TextView title = (TextView) view.findViewById(R.id.title);
        title.setText(newStory.getTitle());

        TextView author = (TextView) view.findViewById(R.id.author);
        author.setText(newStory.getAuthor());

        return view;
    }
}
