package com.example.admin;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class AlreadyBillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_already_bill);

        // Find Views
        TextView headerTextView = findViewById(R.id.header_text_view);
        TextView listTitleTextView = findViewById(R.id.list_title_text_view);
        TextView confirmTextView = findViewById(R.id.confirm_text_view);

        ImageView profileImageView1 = findViewById(R.id.profile_image_view_1);
        TextView profileTextView1 = findViewById(R.id.profile_text_view_1);

        ImageView profileImageView2 = findViewById(R.id.profile_image_view_2);
        TextView profileTextView2 = findViewById(R.id.profile_text_view_2);

        ImageView profileImageView3 = findViewById(R.id.profile_image_view_3);
        TextView profileTextView3 = findViewById(R.id.profile_text_view_3);

        // Set Texts (if needed)
        headerTextView.setText("SINH VIÊN ĐÃ ĐÓNG TIỀN DỊCH VỤ");
        listTitleTextView.setText("Danh sách sinh viên đã đóng tiền dịch vụ");
        confirmTextView.setText("Xác nhận");

        // Set Image Resources (if needed)
        profileImageView1.setImageResource(R.drawable.undraw_pic_profile_re_7g2h);
        profileImageView2.setImageResource(R.drawable.undraw_pic_profile_re_7g2h);
        profileImageView3.setImageResource(R.drawable.undraw_pic_profile_re_7g2h);

        // Optionally set text in profile TextViews
        String profileText = "Họ và tên: Mao Sorakpheanukma\nNhà : K1\nPhòng : 101\nNơi sinh : Campuchia";
        profileTextView1.setText(profileText);
        profileTextView2.setText(profileText);
        profileTextView3.setText(profileText);
    }
}

