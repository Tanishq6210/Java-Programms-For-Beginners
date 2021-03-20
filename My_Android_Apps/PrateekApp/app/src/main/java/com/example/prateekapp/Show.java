package com.example.prateekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Show extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);


        TextView textView = findViewById(R.id.textView);
        textView.setText("Your age is: " + getIntent().getExtras().getString("age") + " years");
    }
}