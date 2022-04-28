package com.company.uczestnicy;

import com.company.ochroniarze.rejestr_visitor.RejestrVisitor;

import java.util.Random;

public class OsobaZZewnatrz extends Uczestnik {
    public OsobaZZewnatrz() {
        super();
        Random random = new Random();
        // random.nextInt(9) zwraca liczbe z przedzialu od 0 wlacznie do 25 wylacznie, a wiec do 24 wlacznie
        // 16 + liczba z przedzialu 0-8 daje liczbe z przedzialu 16-40
        this.wiek = 16 + random.nextInt(25);
    }

    @Override
    public void applyVisitor(RejestrVisitor visitor) {
        visitor.visitOsobaZZewnatrz(this);
    }
}
