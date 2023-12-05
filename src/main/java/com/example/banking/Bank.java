package com.example.banking;

import java.util.ArrayList;

public class Bank {

    ArrayList<Konto> konten = new ArrayList<>();

    public void hinzufuegen(Konto kunde){
        konten.add(kunde);
    }

    public void entfernen(Konto kunde){
        konten.remove(kunde);
    }

    public void KundeAnzeigen(){
        for (Konto i : konten){
            System.out.println(i.getName());
        }
    }
}
