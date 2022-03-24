package com.company.obiekty_kopalniane.pomocnicze;

public abstract class ObiektKopalniany implements MineryObjectEvaluator {

    protected double wartoscRynkowa;

    public ObiektKopalniany(double wartoscRynkowa) {
        this.wartoscRynkowa = wartoscRynkowa;
    }

    public void setWartoscRynkowa(double wartoscRynkowa) {
        this.wartoscRynkowa = wartoscRynkowa;
    }

    public double getWartoscRynkowa() {
        return wartoscRynkowa;
    }
}
