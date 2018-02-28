package com.example.jokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        textView = findViewById(R.id.joke_text);
        Intent intent = getIntent();
        if (intent.hasExtra("the_joke")) {
            textView.setText(intent.getStringExtra("the_joke"));
        }
    }
}
