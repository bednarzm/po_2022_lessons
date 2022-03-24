package com.company.obiekty_kopalniane;

import com.company.obiekty_kopalniane.pomocnicze.ObiektRadioaktywny;

public class Chalkonit extends ObiektRadioaktywny {

    public Chalkonit(float wartoscRynkowa) {
        super(wartoscRynkowa);
    }

    @Override
    public double getModifiedMarketValue() {
        return wartoscRynkowa;
    }

    @Override
    public String toString() {
        return String.valueOf(wartoscRynkowa);
    }
}
