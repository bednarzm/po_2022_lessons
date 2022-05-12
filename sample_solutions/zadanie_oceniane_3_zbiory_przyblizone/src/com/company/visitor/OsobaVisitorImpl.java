package com.company.visitor;

import com.company.osoba.Kobieta;
import com.company.osoba.Mezczyzna;

import java.util.HashSet;
import java.util.Set;

public class OsobaVisitorImpl implements OsobaVisitor {
    private Set<Kobieta> listaKobiet = new HashSet<>();

    @Override
    public void visitKobieta(Kobieta kobieta) {
        listaKobiet.add(kobieta);
    }

    @Override
    public void visitMezczyzna(Mezczyzna mezczyzna) {
        // mezczyzn nie dodajemy
    }

    public Set<Kobieta> getResult() {
        return this.listaKobiet;
    }
}
