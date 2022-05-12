package com.company;

import com.company.my_classes.MyParser;
import com.company.my_classes.MyProcessor;
import com.company.osoba.Kobieta;
import com.company.osoba.Osoba;

import java.util.Set;

public class Demonstrator {

    public static void main(String[] args) {

        Set<Osoba> listaOsob = MyParser.parsePatients("pacjenci.txt");
        System.out.println("Wczytane osoby:");
        System.out.println(listaOsob);

        Set<Kobieta> listaKobiet = MyProcessor.getWomanData(listaOsob);
        System.out.println("Wczytane kobiety:");
        System.out.println(listaKobiet);

        Set<Osoba> przycietaListaOsob = MyProcessor.trimData(listaOsob);
        System.out.println("Osoby z temperatura powyzej 36.4 stopni:");
        System.out.println(przycietaListaOsob);

        System.out.println("Proba sparsowania listy osob, gdzie powtarza sie id poskutkuje wyjatkiem:");
        Set<Osoba> zlaListaOsob = MyParser.parsePatients("pacjenci_bad.txt");
    }
}
