package com.company.pomieszczenia;

import com.company.uczestnicy.Uczestnik;
import com.company.wyjatki.PrzepelnionaSalaException;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sala {
    // kolejnosc zapamietana, bo pod spodem to LinkedHashSet
    private Set<Uczestnik> uczestnicy;
    private int maksPojemnosc;

    public Sala(int maksPojemnosc) {
        this.maksPojemnosc = maksPojemnosc;
        this.uczestnicy = new LinkedHashSet<>();
    }

    public void dodajUczestnika(Uczestnik uczestnik) throws PrzepelnionaSalaException {
        // +1 bo sprawdza miejsce dla nowego uczestnika
        if (uczestnicy.size() + 1 > maksPojemnosc) {
            // jesli wyrzuci wyjatek, to juz nie doda uczestnika
            throw new PrzepelnionaSalaException();
        }
        uczestnicy.add(uczestnik);
    }

    public int getMaksPojemnosc() {
        return maksPojemnosc;
    }

    // wystawiam settera, bo parametr jest konfigurowalny
    public void setMaksPojemnosc(int maksPojemnosc) {
        this.maksPojemnosc = maksPojemnosc;
    }

    public boolean czyJestUczestnik(Uczestnik uczestnik) {
        return uczestnicy.contains(uczestnik);
    }
}
