package com.example.izzatullah.learns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Downloads extends AppCompatActivity {
    Button cmdDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloads);
        cmdDown=(Button)findViewById(R.id.cmdDown);
    }
}
