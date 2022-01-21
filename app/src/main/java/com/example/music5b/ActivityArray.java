package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityArray extends AppCompatActivity {

    TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        Intent i = getIntent();
        String messagioRicevuto = i.getStringExtra("messaggio");

        v = findViewById(R.id.textView);
        v.setText(messagioRicevuto);
    }

}