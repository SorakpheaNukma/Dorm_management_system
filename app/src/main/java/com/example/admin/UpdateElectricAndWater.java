package com.example.admin;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateElectricAndWater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitu_update_eletric);

        // Header
        LinearLayout header = findViewById(R.id.header);
        TextView headerText = findViewById(R.id.header_text);
        headerText.setText("CẬP NHẬT THÔNG TIN ĐIỆN NƯỚC");

        // Room Labels
        TextView labelKhuNhaK = findViewById(R.id.label_khu_nha_k);
        labelKhuNhaK.setText("Khu nhà K");

        TextView labelKhuNhaA = findViewById(R.id.label_khu_nha_a);
        labelKhuNhaA.setText("Khu nhà A");

        // Room Sections
        // Room K1
        LinearLayout roomK1 = findViewById(R.id.room_k1);
        ImageView imageK1 = findViewById(R.id.image_k1);
        imageK1.setImageResource(R.drawable.undraw_coming_home_re_ausc__1_); // Set image resource

        // Room K2
        LinearLayout roomK2 = findViewById(R.id.room_k2);
        ImageView imageK2 = findViewById(R.id.image_k2);
        imageK2.setImageResource(R.drawable.undraw_coming_home_re_ausc__1_); // Set image resource

        // Room K3
        LinearLayout roomK3 = findViewById(R.id.room_k3);
        ImageView imageK3 = findViewById(R.id.image_k3);
        imageK3.setImageResource(R.drawable.undraw_coming_home_re_ausc__1_); // Set image resource

        // Room A1
        LinearLayout roomA1 = findViewById(R.id.room_a1);
        ImageView imageA1 = findViewById(R.id.image_a1);
        imageA1.setImageResource(R.drawable.undraw_coming_home_re_ausc__1_); // Set image resource

        // Room A2
        LinearLayout roomA2 = findViewById(R.id.room_a2);
        ImageView imageA2 = findViewById(R.id.image_a2);
        imageA2.setImageResource(R.drawable.undraw_coming_home_re_ausc__1_); // Set image resource

        // Room A3
        LinearLayout roomA3 = findViewById(R.id.room_a3);
        ImageView imageA3 = findViewById(R.id.image_a3);
        imageA3.setImageResource(R.drawable.undraw_coming_home_re_ausc__1_); // Set image resource
    }
}

