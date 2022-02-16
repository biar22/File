package com.example.music5b;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class GestoreFile {

    String nomeFile;

    public GestoreFile(){

    }

    public GestoreFile(String nomeFile){
        this.nomeFile = nomeFile;
    }

    public String readFile(String nomeFile, Context c)  {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader filedaleggere = new BufferedReader(new InputStreamReader(c.openFileInput(nomeFile)));

            String testoDaRestituire = "";
            while ((testoDaRestituire = filedaleggere.readLine())!= null){
                sb.append(testoDaRestituire + "\n");
            }

        } catch (FileNotFoundException e) {
            Log.e("gestore", "File inesistente");
            return "errore";
        } catch (IOException e) {
            e.printStackTrace();
            return "errore";
        }
        return sb.toString();
    }

        public String scriviFile(String nomeFile , Context c, String testodascrivere)
        {
            String esito;
            FileOutputStream file0;
            try {
                file0 = c.openFileOutput(nomeFile , Context.MODE_PRIVATE);
                file0.write(testodascrivere.getBytes());
                file0.close();
                esito = "File scritto correttamento";
            } catch (FileNotFoundException e) {
                esito = "Attenzione non sono riuscito a creare il file";

            } catch (IOException e) {
                esito = "Errore in fase di scrittura del file";
            }

            return esito ;
        }

}
