package com.example.music5b;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> listaBrani = new ArrayList<Brano>();
    public GestoreBrani(){
        listaBrani = new ArrayList<Brano>();
    }
    public void addBrano(){
        Brano b = new Brano();
        listaBrani.add(b);
    }
    public String toString(Brano b){
        return b.getTitolo() + " " + b.getDurata() + " " + b.getAutore() + " " + b.getGenere();
    }
}
