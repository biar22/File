package com.example.music5b;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> listaBrani = new ArrayList<Brano>();
    public GestoreBrani(){

        listaBrani = new ArrayList<Brano>();
    }
    public void addBrano(Brano b){
        //Brano b = new Brano(titolo);
        listaBrani.add(b);
    }
}
