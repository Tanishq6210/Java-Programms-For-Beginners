package com.example.priyankaadapter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class NumberActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Tanishq", "Tyagi"));
        words.add(new Word("Priyanka", "Chowdhury"));

        WordAdapter ad = new WordAdapter(this, R.layout.list_items, words);
        ListView rootView = (ListView) findViewById(R.id.rootView);
        rootView.setAdapter(ad);
    }
}
