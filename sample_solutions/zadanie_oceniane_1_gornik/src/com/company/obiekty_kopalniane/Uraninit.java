package com.company.obiekty_kopalniane;

import com.company.obiekty_kopalniane.pomocnicze.ObiektRadioaktywny;
import com.company.obiekty_kopalniane.pomocnicze.TypUraninitu;

import java.util.Random;

public class Uraninit extends ObiektRadioaktywny {
    private TypUraninitu typ;

    public Uraninit(float wortoscRynkowa) {
        super(wortoscRynkowa);
        Random rand = new Random();
        typ = TypUraninitu.values()[rand.nextInt(TypUraninitu.values().length)];
    }

    @Override
    public String toString() {
        return String.valueOf(wartoscRynkowa);
    }

    @Override
    public double getModifiedMarketValue() {

        double mnoznik = switch (typ) {
            case TORBERNIT -> 1.5;
            case FOUMARIERYT -> 2.5;
            case URANOFAN -> 1;
        };
        return wartoscRynkowa * mnoznik;
    }

    public TypUraninitu getTyp() {
        return typ;
    }
}
