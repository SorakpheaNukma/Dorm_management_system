package com.example.admin;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FreeRoomActivity extends AppCompatActivity {

    private Spinner selectHouseSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_room);

        // Initialize UI components
        TextView header = findViewById(R.id.header);
        TextView totalRooms = findViewById(R.id.total_rooms);
        TextView selectHouseLabel = findViewById(R.id.select_house_label);
        selectHouseSpinner = findViewById(R.id.select_house_spinner);
        TextView studentsListHeader = findViewById(R.id.students_list_header);

        // Set up Spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.house_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectHouseSpinner.setAdapter(adapter);

        // You can set up other views or data here as needed
    }
}