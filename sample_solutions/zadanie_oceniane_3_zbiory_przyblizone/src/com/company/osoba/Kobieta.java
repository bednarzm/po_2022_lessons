package com.company.osoba;

import com.company.visitor.OsobaVisitor;

public class Kobieta extends Osoba {
    private String nazwiskoRodowe;

    public Kobieta(int id, int wiek, double temperatura, boolean kaszel, boolean covidDodatni, String nazwiskoRodowe) {
        super(id, wiek, temperatura, kaszel, covidDodatni);
        this.nazwiskoRodowe = nazwiskoRodowe;
    }

    @Override
    public void applyOsobaVisitor(OsobaVisitor visitor) {
        visitor.visitKobieta(this);
    }

    @Override
    public String toString() {
        return "Kobieta{" +
                super.toString() +
                ", nazwiskoRodowe='" + nazwiskoRodowe +
                '}';
    }
}
