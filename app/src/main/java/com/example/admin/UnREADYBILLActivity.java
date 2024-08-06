package com.example.admin;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class UnREADYBILLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_un_bill);

        // Initialize Header Box
        TextView headerTextView = findViewById(R.id.header_text_view);
        headerTextView.setText("SINH VIÊN CHƯA ĐÓNG TIỀN DỊCH VỤ");

        // Initialize List Title Box
        TextView listTitleTextView = findViewById(R.id.list_title_text_view);
        listTitleTextView.setText("Danh sách sinh viên chưa đóng tiền dịch vụ");

        // Initialize Confirm Button Box
        TextView confirmTextView = findViewById(R.id.confirm_text_view);
        confirmTextView.setText("Xác nhận");

        // Initialize Profile Section 1
        ImageView profileImageView1 = findViewById(R.id.profile_image_view_1);
        profileImageView1.setImageResource(R.drawable.undraw_pic_profile_re_7g2h);
        TextView profileTextView1 = findViewById(R.id.profile_text_view_1);
        profileTextView1.setText("Họ và tên: Mao Sorakpheanukma\nNhà : K1\nPhòng : 101\nNơi sinh : Campuchia");

        // Initialize Profile Section 2
        ImageView profileImageView2 = findViewById(R.id.profile_image_view_2);
        profileImageView2.setImageResource(R.drawable.undraw_pic_profile_re_7g2h);
        TextView profileTextView2 = findViewById(R.id.profile_text_view_2);
        profileTextView2.setText("Họ và tên: Mao Sorakpheanukma\nNhà : K1\nPhòng : 101\nNơi sinh : Campuchia");

        // Initialize Profile Section 3
        ImageView profileImageView3 = findViewById(R.id.profile_image_view_3);
        profileImageView3.setImageResource(R.drawable.undraw_pic_profile_re_7g2h);
        TextView profileTextView3 = findViewById(R.id.profile_text_view_3);
        profileTextView3.setText("Họ và tên: Mao Sorakpheanukma\nNhà : K1\nPhòng : 101\nNơi sinh : Campuchia");
    }
}



