package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    Button btnVisualizza;
    EditText titoloCanzone;
    EditText durataCanzone;
    EditText autoreCanzone;
    Spinner spnGeneri;
    GestoreBrani gb;
    Brano b;
    ArrayAdapter<String> aaG;

    String[] generi = {"Pop", "Drill", "Classica"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        titoloCanzone = (EditText) findViewById(R.id.TItolo);
        durataCanzone = (EditText) findViewById(R.id.Durata);
        autoreCanzone = (EditText) findViewById(R.id.Autore);
        btnInserisci = (Button) findViewById(R.id.btnInserisci);
        spnGeneri = (Spinner) findViewById(R.id.spnGeneri);

        gb = new GestoreBrani();
        b = new Brano();
        aaG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generi);

        spnGeneri.setAdapter(aaG);

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.setTitolo(titoloCanzone.getText().toString());
                b.setAutore(autoreCanzone.getText().toString());
                b.setDurata(durataCanzone.getText().toString());
                b.setGenere(spnGeneri.getSelectedItem().toString());
                //String genselezionato = spnGeneri.getSelectedItem().toString();
                //Toast.makeText(getApplicationContext(), genselezionato, Toast.LENGTH_LONG).show();
                gb.addBrano();

            }

        });

    }
    public void lanciaDue(View v)
    {
        Intent i = new Intent(getApplicationContext(), ActivityArray.class);
        i.putExtra("messaggio" , gb.toString(b));
        startActivity(i);
    }
}