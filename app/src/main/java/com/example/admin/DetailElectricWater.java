package com.example.admin;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailElectricWater extends AppCompatActivity {

    private TextView homeTitle;
    private Spinner spinnerHouse;
    private Spinner spinnerFloor;
    private Spinner spinnerMonth;
    private RelativeLayout profileSection1;
    private RelativeLayout profileSection2;
    private RelativeLayout profileSection3;
    private ImageView profileImageView1;
    private ImageView profileImageView2;
    private ImageView profileImageView3;
    private TextView profileTextView1;
    private TextView profileTextView2;
    private TextView profileTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_elec);

        // Initialize views
        homeTitle = findViewById(R.id.home_title);
        spinnerHouse = findViewById(R.id.spinner_house);
        spinnerFloor = findViewById(R.id.spinner_floor);
        spinnerMonth = findViewById(R.id.spinner_month);

        profileSection1 = findViewById(R.id.profile_section_1);
        profileImageView1 = findViewById(R.id.profile_image_view_1);
        profileTextView1 = findViewById(R.id.profile_text_view_1);

        profileSection2 = findViewById(R.id.profile_section_2);
        profileImageView2 = findViewById(R.id.profile_image_view_2);
        profileTextView2 = findViewById(R.id.profile_text_view_2);

        profileSection3 = findViewById(R.id.profile_section_3);
        profileImageView3 = findViewById(R.id.profile_image_view_3);
        profileTextView3 = findViewById(R.id.profile_text_view_3);

        // You can set data or listeners here
        setupViewData();
    }

    private void setupViewData() {
        // Set the text for the profile sections
        profileTextView1.setText("Phòng: 101 \nSố điện cũ : 123kmh\nSố điện mới : 123kmh\nSố nước cũ : 123km3\nSố nước mới : 123km3");
        profileTextView2.setText("Phòng: 102\nSố điện cũ : 123kmh\nSố điện mới : 123kmh\nSố nước cũ : 123km3\nSố nước mới : 123km3");
        profileTextView3.setText("Phòng: 103 \nSố điện cũ : 123kmh\nSố điện mới : 123kmh\nSố nước cũ : 123km3\nSố nước mới : 123km3");

        // You can also set images for the profileImageViews if needed
        // profileImageView1.setImageResource(R.drawable.your_image);
        // profileImageView2.setImageResource(R.drawable.your_image);
        // profileImageView3.setImageResource(R.drawable.your_image);
    }
}

