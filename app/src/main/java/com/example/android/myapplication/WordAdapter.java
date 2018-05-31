package com.example.android.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter  extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> androidInfo) {
        super(context, 0, androidInfo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentInfo = getItem(position);

        TextView headerView=(TextView) listItemView.findViewById(R.id.header);
        headerView.setText(currentInfo.getHeader());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        defaultTextView.setText(currentInfo.getmDefaultDescription());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentInfo.getmImageResourceId());

        return listItemView;
    }
}
