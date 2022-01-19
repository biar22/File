package com.example.music5b;

import android.os.Build;


import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Brano {
    private String titolo;
    private String genere;
    private String autore;
    private LocalDate datapubblic;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Brano(String t, String a, String g, String d)
    {
        titolo=t;
        autore=a;
        genere=g;
        datapubblic = LocalDate.parse(d, DateTimeFormatter.ofPattern("d/MM/yyyy"));
    }
    public String getTitolo(){
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    public LocalDate getDatapubblic() {
        return datapubblic;
    }
}
