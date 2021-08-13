package com.choudhary.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomeActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        listView = findViewById(R.id.list_view_id);


        String[] peoples = {"Rahul","Vicky","Shubham", "Rahul","Vicky","Shubham" ,"Rahul","Vicky","Shubham" ,"Rahul","Vicky","Shubham" ,"Rahul","Vicky","Shubham" };

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,peoples);
        listView.setAdapter(arrayAdapter);

    }
}