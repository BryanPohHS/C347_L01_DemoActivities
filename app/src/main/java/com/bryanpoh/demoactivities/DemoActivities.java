package com.bryanpoh.demoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DemoActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the button and set onclicklistener
        Button btnDone = findViewById(R.id.button);

        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get edit text name
                EditText etName = findViewById(R.id.editText);

                // Get edit text age
                EditText etAge = findViewById(R.id.editText2);

                // Put name and age into array
                String[] info = {etName.getText().toString(), etAge.getText().toString()};

                // Create intent to start activity called demoActivities
                Intent i = new Intent(DemoActivities.this, DemoActivities2.class);

                // Pass String array into activity
                i.putExtra("info", info);

                // Start new activitiy
                startActivity(i);
            }
        });
    }
}
