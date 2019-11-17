package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        // use the data

        Intent intent = getIntent();

        String message = intent.getStringExtra(Intent.EXTRA_TEXT);

        TextView textView = findViewById(R.id.textView);

        textView.setText(message);
    }
}
