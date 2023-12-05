package com.example.banking;

public class Main {
    public static void main(String arg[]){
        Konto kunde1 = new Konto("Alex");
        Konto kunde2 = new Konto("Ali");
        Konto kunde3 = new Konto("John");
        Konto kunde4 = new Konto("Omar");
        Konto kunde5 = new Konto("Mo");

        Bank sparkasse = new Bank();
        sparkasse.hinzufuegen(kunde1);
        sparkasse.hinzufuegen(kunde2);
        sparkasse.hinzufuegen(kunde3);
        sparkasse.hinzufuegen(kunde4);
        sparkasse.hinzufuegen(kunde5);

        sparkasse.entfernen(kunde3);

        sparkasse.KundeAnzeigen();




    }
}
