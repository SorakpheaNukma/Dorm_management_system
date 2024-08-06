package com.example.admin;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information); // Link to the XML layout

        // Access UI components using findViewById if needed
        TextView homeTitle = findViewById(R.id.home_title);
        TextView header1 = findViewById(R.id.header1);
        TextView header2 = findViewById(R.id.header2);

        homeTitle.setText("Trang chủ");
        header1.setText("Thông báo mới");
        header2.setText("Hướng dẫn");
    }
}
