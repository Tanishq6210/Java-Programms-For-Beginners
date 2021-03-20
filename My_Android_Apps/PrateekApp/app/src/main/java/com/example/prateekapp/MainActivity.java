package com.example.prateekapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.age);
        TextView textView = (TextView) findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String text = String.valueOf("Your age in years is : " + editText.getText());
//                textView.setText(text);
//                textView.setVisibility(View.VISIBLE);

                Intent intent = new Intent(MainActivity.this, Show.class);
                intent.putExtra("age",editText.getText().toString());
                startActivity(intent);
            }
        });

    }
}