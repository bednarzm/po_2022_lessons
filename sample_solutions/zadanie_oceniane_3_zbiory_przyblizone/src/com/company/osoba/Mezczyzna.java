package com.company.osoba;

import com.company.visitor.OsobaVisitor;

public class Mezczyzna extends Osoba {
    private boolean bylWWojsku;

    public Mezczyzna(int id, int wiek, double temperatura, boolean kaszel, boolean covidDodatni, boolean bylWWojsku) {
        super(id, wiek, temperatura, kaszel, covidDodatni);
        this.bylWWojsku = bylWWojsku;
    }

    @Override
    public void applyOsobaVisitor(OsobaVisitor visitor) {
        visitor.visitMezczyzna(this);
    }

    @Override
    public String toString() {
        return "Mezczyzna{" +
                super.toString() +
                ", bylWWojsku=" + bylWWojsku +
                '}';
    }
}
