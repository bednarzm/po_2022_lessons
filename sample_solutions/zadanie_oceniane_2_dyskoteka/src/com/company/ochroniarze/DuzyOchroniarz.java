package com.company.ochroniarze;

import com.company.ochroniarze.rejestr_visitor.RejestrVisitor;
import com.company.pomieszczenia.Hol;
import com.company.pomieszczenia.Sala;
import com.company.uczestnicy.Uczestnik;

public class DuzyOchroniarz extends MalyOchroniarz {
    private RejestrObcych rejestrObcych;

    public DuzyOchroniarz(Sala malaSala, Sala duzaSala, Hol hol) {
        super(malaSala, duzaSala, hol);
        this.rejestrObcych = new RejestrObcych();
    }

    @Override
    public boolean check(Uczestnik uczestnik) {
        boolean result = super.check(uczestnik);

        // jesli weszla
        if (result) {
            RejestrVisitor visitor = new RejestrVisitor(rejestrObcych);
            uczestnik.applyVisitor(visitor);
        }

        return result;
    }

    public void printStrangers() {
        System.out.println(rejestrObcych);
    }
}
