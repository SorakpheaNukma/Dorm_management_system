package com.example.admin;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Update extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update);

        // Find views by ID
        findViewById(R.id.home_title);
        findViewById(R.id.filter_instruction);
        findViewById(R.id.tang_spinner);
        findViewById(R.id.thuc_trang_spinner);
        findViewById(R.id.save_button);

        // Set data or listeners if needed
    }
}

