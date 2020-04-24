package com.bryanpoh.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivities2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities2);

        // Get the intent so as to get the things inside the intent
        Intent i = getIntent();

        // Get string array "info"
        String[] info = i.getStringArrayExtra("info");

        // Get textview objkect
        TextView tv1 = findViewById(R.id.textView1);

        // Display name and age on tv
        tv1.setText("You are " + info[0] + ", age " + info[1]);
    }
}
