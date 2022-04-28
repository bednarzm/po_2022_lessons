package com.company.ochroniarze;

import com.company.uczestnicy.OsobaZZewnatrz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RejestrObcych {
    private Map<String, Set<OsobaZZewnatrz>> uczestnicyWRejestrze;

    public RejestrObcych() {
        this.uczestnicyWRejestrze = new HashMap<>();
    }

    public void dodajDoRejestru(OsobaZZewnatrz osobaZZewnatrz) {
        // jesli nie ma zbioru odpowiadajacego imieniu to go tworzy
        if (!uczestnicyWRejestrze.containsKey(osobaZZewnatrz.getImie())) {
            uczestnicyWRejestrze.put(osobaZZewnatrz.getImie(), new HashSet<>());
        }
        // dodaje osobe do zbioru odpowiadajacego jego imieniu
        Set<OsobaZZewnatrz> zbior = uczestnicyWRejestrze.get(osobaZZewnatrz.getImie());
        zbior.add(osobaZZewnatrz);
    }

    public boolean czymMoznaDodac(OsobaZZewnatrz osobaZZewnatrz) {
        // jesli nie ma jego imienia to go na pewno tez, wiec mozna dodac
        if (!uczestnicyWRejestrze.containsKey(osobaZZewnatrz.getImie())) {
            return true;
        }
        Set<OsobaZZewnatrz> zbior = uczestnicyWRejestrze.get(osobaZZewnatrz.getImie());
        // jesli jest w zbiorze, to nie mozna dodac, wiec przeciwienstwo
        return !zbior.contains(osobaZZewnatrz);
    }

    @Override
    public String toString() {
        return "RejestrObcych{" +
                "uczestnicyWRejestrze=" + uczestnicyWRejestrze +
                '}';
    }
}
