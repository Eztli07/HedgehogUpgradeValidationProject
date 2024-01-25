package com.example.hedgehogupgradevalidationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int clicks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked (View v)
    {
        clicks++;
        TextView clicked = findViewById(R.id.clicked);
        clicked.setText("You have clicked The Button " + clicks + " time(s).");
    }
}