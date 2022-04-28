package com.company.ochroniarze;

import com.company.pomieszczenia.Hol;
import com.company.pomieszczenia.Sala;
import com.company.uczestnicy.Uczestnik;
import com.company.wyjatki.PrzepelnionaSalaException;

import java.util.Random;

public class MalyOchroniarz {
    private Sala malaSala;
    private Sala duzaSala;
    private Hol hol;

    public MalyOchroniarz(Sala malaSala, Sala duzaSala, Hol hol) {
        this.malaSala = malaSala;
        this.duzaSala = duzaSala;
        this.hol = hol;
    }

    public boolean check(Uczestnik uczestnik) {
        if (uczestnik.getWiek() >= 18) {
            Random random = new Random();
            // dodajUczestnika najpierw sprawdza, czy mozna dodac, wiec jesli rzuci wjatek, to nie doda uczestnika
            try {
                if (random.nextBoolean()) {
                    malaSala.dodajUczestnika(uczestnik);
                } else {
                    duzaSala.dodajUczestnika(uczestnik);
                }
                return true;
            } catch (PrzepelnionaSalaException e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
