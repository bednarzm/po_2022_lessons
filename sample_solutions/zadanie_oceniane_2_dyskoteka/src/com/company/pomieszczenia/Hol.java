package com.company.pomieszczenia;

import com.company.uczestnicy.OsobaZZewnatrz;
import com.company.uczestnicy.Student;
import com.company.uczestnicy.Studentka;
import com.company.uczestnicy.Uczestnik;

import java.util.LinkedList;
import java.util.List;

public class Hol {
    // pod spodem jest to LinkedList <=> szybkie usuwanie
    private List<Uczestnik> uczestnicy;

    public Hol() {
        this.uczestnicy = stworzUczestnikow();
    }

    public void usunZHolu(Uczestnik uczestnik) {
        uczestnicy.remove(uczestnik);
    }

    private List<Uczestnik> stworzUczestnikow() {
        List<Uczestnik> stworzeniUczestnicy = new LinkedList<>();
        for (int i = 0; i < 33; i++) {
            stworzeniUczestnicy.add(new Student());
            stworzeniUczestnicy.add(new Studentka());
            stworzeniUczestnicy.add(new OsobaZZewnatrz());
        }
        return stworzeniUczestnicy;
    }

    public List<Uczestnik> getUczestnicy() {
        return uczestnicy;
    }
}
