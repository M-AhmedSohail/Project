package com.project.i200557_i200405_i200590;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bore = findViewById(R.id.bore);

        // Set a click listener for the button
        bore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the Frags activity when the button is clicked
                Intent intent = new Intent(MainActivity.this, Frags.class);
                startActivity(intent);
            }
        });
    }



}


