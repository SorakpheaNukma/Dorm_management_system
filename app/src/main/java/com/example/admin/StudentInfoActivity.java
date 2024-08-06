package com.example.admin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class StudentInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        Button buttonAll = findViewById(R.id.button_all);
        Button buttonStaying = findViewById(R.id.button_staying);
        Button buttonLeft = findViewById(R.id.button_left);
        Button buttonActivity = findViewById(R.id.button_activity);

        // Set click listeners for buttons
        buttonAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click
            }
        });

        buttonStaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click
            }
        });

        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click
            }
        });

        buttonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click
            }
        });
    }
}

