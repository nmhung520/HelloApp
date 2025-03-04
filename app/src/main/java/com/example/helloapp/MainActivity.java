package com.example.helloapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView helloText = findViewById(R.id.helloText);
        Button helloButton = findViewById(R.id.helloButton);

        helloButton.setOnClickListener(v -> {
            helloText.setText("Hello, Friend!");
        });
    }
}