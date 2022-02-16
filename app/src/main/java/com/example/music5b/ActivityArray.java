package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityArray extends AppCompatActivity {

    TextView v, lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        Intent i = getIntent();
        String lista = i.getStringExtra("messaggio");

        v = findViewById(R.id.textView);
        v.setText(lista);
    }
    //public void back(View v){
      //  Intent i = new Intent(getApplicationContext(), MainActivity.class); //istanziare una intent
        //startActivity(i);    }
}