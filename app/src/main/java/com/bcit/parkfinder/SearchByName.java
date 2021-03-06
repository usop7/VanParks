package com.bcit.parkfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchByName extends AppCompatActivity {

    Button btnSearch;
    EditText etParkName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_name);

        etParkName = findViewById(R.id.etParkName);
        btnSearch = findViewById(R.id.btnSearch);

        // send keyword containing park name through intent to ParkListActivity
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchByName.this, ParkListActivity.class);
                intent.putExtra("mode", "name");
                intent.putExtra("keyword", etParkName.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}
