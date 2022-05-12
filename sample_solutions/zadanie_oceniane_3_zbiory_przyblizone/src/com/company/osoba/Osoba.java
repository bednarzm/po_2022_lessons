package com.company.osoba;

import com.company.visitor.OsobaVisitor;

public abstract class Osoba {
    private int id;
    private int wiek;
    private double temperatura;
    private boolean kaszel;
    private boolean covidDodatni;

    public Osoba(int id, int wiek, double temperatura, boolean kaszel, boolean covidDodatni) {
        this.id = id;
        this.wiek = wiek;
        this.temperatura = temperatura;
        this.kaszel = kaszel;
        this.covidDodatni = covidDodatni;
    }

    public abstract void applyOsobaVisitor(OsobaVisitor visitor);

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        return id == osoba.id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", wiek=" + wiek +
                ", temperatura=" + temperatura +
                ", kaszel=" + kaszel +
                ", covidDodatni=" + covidDodatni;
    }
}
