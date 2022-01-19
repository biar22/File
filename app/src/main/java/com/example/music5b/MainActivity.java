package com.example.music5b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnInserisci;
    EditText txtInserisci;
    Spinner spnGeneri;
    GestoreBrani gb;
    ArrayAdapter<String> aaG;

    String[] generi = {"Pop", "Drill", "Classica"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInserisci = (EditText) findViewById(R.id.txtInserisci);
        btnInserisci = (Button) findViewById(R.id.btnInserisci);
        spnGeneri = (Spinner) findViewById(R.id.spnGeneri);
        gb = new GestoreBrani();

        aaG = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, generi);

        spnGeneri.setAdapter(aaG);

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String genselezionato = spnGeneri.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), genselezionato, Toast.LENGTH_LONG).show();
                gb.addBrano();
            }

        });

    }
}