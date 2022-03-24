package com.company.obiekty_kopalniane;

import com.company.obiekty_kopalniane.pomocnicze.ObiektKopalniany;

public class Skala extends ObiektKopalniany {

    public Skala() {
        super(1);
    }

    @Override
    public String toString() {
        return String.valueOf(wartoscRynkowa);
    }
}
