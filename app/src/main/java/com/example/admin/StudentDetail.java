package com.example.admin;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(getResources().getColor(android.R.color.white));

        // Header
        TextView headerText = new TextView(this);
        headerText.setId(View.generateViewId());
        headerText.setLayoutParams(new RelativeLayout.LayoutParams(
                dpToPx(372), dpToPx(56)));
        ((RelativeLayout.LayoutParams) headerText.getLayoutParams()).addRule(RelativeLayout.CENTER_HORIZONTAL);
        ((RelativeLayout.LayoutParams) headerText.getLayoutParams()).setMargins(0, dpToPx(36), 0, 0);
        headerText.setBackgroundColor(getResources().getColor(R.color.purple_700)); // Use your color resource
        headerText.setText("CHI TIẾT THÔNG TIN SINH VIÊN");
        headerText.setTextColor(getResources().getColor(android.R.color.white));
        headerText.setTextSize(20);
        headerText.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        headerText.setGravity(Gravity.CENTER);

        // OK Button
        Button okButton = new Button(this);
        okButton.setId(View.generateViewId());
        okButton.setLayoutParams(new RelativeLayout.LayoutParams(
                dpToPx(372), dpToPx(56)));
        ((RelativeLayout.LayoutParams) okButton.getLayoutParams()).addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        ((RelativeLayout.LayoutParams) okButton.getLayoutParams()).setMargins(0, 0, 0, dpToPx(36));
        okButton.setBackgroundColor(getResources().getColor(R.color.purple_700)); // Use your color resource
        okButton.setText("OK");
        okButton.setTextColor(getResources().getColor(android.R.color.white));
        okButton.setTextSize(20);

        // Student Information Section
        LinearLayout studentInfoLayout = new LinearLayout(this);
        studentInfoLayout.setLayoutParams(new RelativeLayout.LayoutParams(
                dpToPx(377), LinearLayout.LayoutParams.WRAP_CONTENT));
        ((RelativeLayout.LayoutParams) studentInfoLayout.getLayoutParams()).addRule(RelativeLayout.BELOW, headerText.getId());
        ((RelativeLayout.LayoutParams) studentInfoLayout.getLayoutParams()).setMargins(dpToPx(28), dpToPx(84), dpToPx(15), 0);
        studentInfoLayout.setOrientation(LinearLayout.VERTICAL);

        TextView studentInfoHeader = new TextView(this);
        studentInfoHeader.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        studentInfoHeader.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        studentInfoHeader.setBackgroundColor(getResources().getColor(R.color.purple_700)); // Use your color resource
        studentInfoHeader.setText("Thông tin sinh viên");
        studentInfoHeader.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        studentInfoHeader.setTextColor(getResources().getColor(android.R.color.white));
        studentInfoHeader.setTextSize(16);

        TextView[] studentInfoTexts = new TextView[]{
                createTextView("Họ và Tên: "),
                createTextView("Giới tính: Nam"),
                createTextView("Ngày sinh:"),
                createTextView("Mã số SV: "),
                createTextView("Số điện thoại: "),
                createTextView("Email:"),
                createTextView("Nơi sinh:"),
                createTextView("Dân tộc:"),
                createTextView("Số CMND/CCCD:"),
                createTextView("Hiện diện: ")
        };

        studentInfoLayout.addView(studentInfoHeader);
        for (TextView textView : studentInfoTexts) {
            studentInfoLayout.addView(textView);
        }

        // Room Information Section
        LinearLayout roomInfoLayout = new LinearLayout(this);
        roomInfoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        roomInfoLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        roomInfoLayout.setOrientation(LinearLayout.VERTICAL);

        TextView roomInfoHeader = new TextView(this);
        roomInfoHeader.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        roomInfoHeader.setBackgroundColor(getResources().getColor(R.color.purple_700)); // Use your color resource
        roomInfoHeader.setText("Thông tin phòng");
        roomInfoHeader.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        roomInfoHeader.setTextColor(getResources().getColor(android.R.color.white));
        roomInfoHeader.setTextSize(16);

        TextView[] roomInfoTexts = new TextView[]{
                createTextView("Nhà: "),
                createTextView("Phòng: "),
                createTextView("Thực trạng phòng: "),
                createTextView("Thời gian đăng ký: ")
        };

        roomInfoLayout.addView(roomInfoHeader);
        for (TextView textView : roomInfoTexts) {
            roomInfoLayout.addView(textView);
        }

        studentInfoLayout.addView(roomInfoLayout);
        relativeLayout.addView(studentInfoLayout);
        relativeLayout.addView(okButton);
        relativeLayout.addView(headerText);

        setContentView(relativeLayout);
    }

    private TextView createTextView(String text) {
        TextView textView = new TextView(this);
        textView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        textView.setText(text);
        textView.setTextColor(getResources().getColor(android.R.color.black));
        textView.setTextSize(16);
        return textView;
    }

    private int dpToPx(int dp) {
        float density = getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }
}
