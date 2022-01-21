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
    private String durata;

    public Brano()
    {
       this.titolo = titolo;
       this.autore = autore;
       this.durata = durata;
       this.genere = genere;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public String getDurata() {
        return durata;
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

    @Override
    public String toString() { return titolo + durata + genere + autore; }

}
