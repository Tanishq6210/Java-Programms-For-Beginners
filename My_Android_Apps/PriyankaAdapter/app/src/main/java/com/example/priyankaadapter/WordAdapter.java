package com.example.priyankaadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;


public class WordAdapter extends ArrayAdapter<Word> {
    ArrayList<Word> words = new ArrayList<>();

    public WordAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Word> objects) {
        super(context, resource, objects);
        words = objects;
    }

    @Nullable
    @Override
    public Word getItem(int position) {
        return words.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        textView.setText(getItem(position).getText1());
        TextView textView1 = (TextView) convertView.findViewById(R.id.textView2);
        textView1.setText(getItem(position).getText2());
        return convertView;
    }
}
