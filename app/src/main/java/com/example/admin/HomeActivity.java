package com.example.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private FrameLayout dashboardFrame;
    private FrameLayout repairFrame;
    private FrameLayout notificationFrame;
    private FrameLayout settingsFrame;
    private FrameLayout deviceFrame;
    private FrameLayout serviceFrame;
    private FrameLayout studentFrame;
    private FrameLayout logoutFrame;
    private FrameLayout RoomChangeframe;

    private ImageView dashboardBackground;
    private ImageView repairBackground;
    private ImageView notificationBackground;
    private ImageView settingsBackground;
    private ImageView deviceBackground;
    private ImageView serviceBackground;
    private ImageView studentBackground;
    private ImageView logoutBackground;
    private ImageView RoomchangeBackground;

    private TextView dashboardText;
    private TextView repairText;
    private TextView notificationText;
    private TextView settingsText;
    private TextView deviceText;
    private TextView serviceText;
    private TextView studentText;
    private TextView logoutText;
    private TextView RoomChangeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Make sure this matches your XML layout file name

        // Initialize FrameLayouts
        dashboardFrame = findViewById(R.id.dashboard_frame);
        repairFrame = findViewById(R.id.repair_frame);
        notificationFrame = findViewById(R.id.notification_frame);
        settingsFrame = findViewById(R.id.settings_frame);
        deviceFrame = findViewById(R.id.device_frame);
        serviceFrame = findViewById(R.id.service_frame);
        studentFrame = findViewById(R.id.student_frame);
        logoutFrame = findViewById(R.id.logout_frame);
        RoomChangeframe = findViewById(R.id.RoomChange_frame);

        // Initialize ImageViews
        dashboardBackground = findViewById(R.id.dashboard_background);
        repairBackground = findViewById(R.id.repair_background);
        notificationBackground = findViewById(R.id.notification_background);
        settingsBackground = findViewById(R.id.settings_background);
        deviceBackground = findViewById(R.id.device_background);
        serviceBackground = findViewById(R.id.service_background);
        studentBackground = findViewById(R.id.student_background);
        logoutBackground = findViewById(R.id.logout_background);
        RoomchangeBackground=findViewById(R.id.RoomChange_background);

        // Initialize TextViews
        dashboardText = findViewById(R.id.dashboard_text);
        repairText = findViewById(R.id.repair_text);
        notificationText = findViewById(R.id.notification_text);
        settingsText = findViewById(R.id.settings_text);
        deviceText = findViewById(R.id.device_text);
        serviceText = findViewById(R.id.service_text);
        studentText = findViewById(R.id.student_text);
        logoutText = findViewById(R.id.logout_text);
        RoomChangeText=findViewById(R.id.RoomChange_text);

        // Set up event listeners (if needed)
        // Example: setOnClickListener for logout frame
        logoutFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle logout action
                // e.g., startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });
        FrameLayout dashboardFrame = findViewById(R.id.dashboard_frame);
        dashboardFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click action here
                // For example, navigate to a new activity
                Intent intent = new Intent(HomeActivity.this, StudentDetail.class);
                startActivity(intent);
            }
        });

    }
}
