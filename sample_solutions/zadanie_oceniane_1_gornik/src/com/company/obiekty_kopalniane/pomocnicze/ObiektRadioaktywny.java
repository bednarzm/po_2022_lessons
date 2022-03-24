package com.company.obiekty_kopalniane.pomocnicze;

import java.util.Random;

public class ObiektRadioaktywny extends ObiektKopalniany {
    private int radioaktywnosc;

    public ObiektRadioaktywny(double wartoscRynkowa) {
        super(wartoscRynkowa);
        Random rand = new Random();
        this.radioaktywnosc = 700 + rand.nextInt(950 - 700);
    }

    public void setRadioaktywnosc(int radioaktywnosc) {
        this.radioaktywnosc = radioaktywnosc;
    }

    public int getRadioaktywnosc() {
        return radioaktywnosc;
    }
}
