package com.company.visitor;

import com.company.osoba.Kobieta;
import com.company.osoba.Mezczyzna;

public interface OsobaVisitor {
    void visitMezczyzna(Mezczyzna mezczyzna);

    void visitKobieta(Kobieta kobieta);
}
