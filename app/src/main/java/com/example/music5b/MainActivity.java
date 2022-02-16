package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnScrivi;
    Button btnLeggi;
    EditText txtContenuto;
    GestoreFile gf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtContenuto = (EditText) findViewById(R.id.txtContenuto);
        btnLeggi = (Button) findViewById(R.id.btnLeggi);
        gf = new GestoreFile();
        btnScrivi = (Button) findViewById(R.id.btnScrivi);

        gf = new GestoreFile();
        btnLeggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String stringaricevuta = gf.readFile("prova.txt" , getApplicationContext());
                Toast.makeText(getApplicationContext(), stringaricevuta, Toast.LENGTH_LONG).show();
            }

        });

        btnScrivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String esito = gf.scriviFile("prova.txt", getApplicationContext(), txtContenuto.getText().toString());
                Toast.makeText(getApplicationContext(), esito, Toast.LENGTH_LONG).show();
            }

        });

    }
    //public void lanciaDue(View v)
    //{
      //  Intent i = new Intent(getApplicationContext(), ActivityArray.class); //istanziare una intent
        //i.putExtra("messaggio" , gb.listaBran());
        //startActivity(i);
    //}
}