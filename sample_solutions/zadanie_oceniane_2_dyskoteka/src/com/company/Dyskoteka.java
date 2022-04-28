package com.company;

import com.company.ochroniarze.DuzyOchroniarz;
import com.company.ochroniarze.MalyOchroniarz;
import com.company.pomieszczenia.Hol;
import com.company.pomieszczenia.Sala;
import com.company.uczestnicy.Uczestnik;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Dyskoteka {
    private Hol hol;
    private Sala malaSala;
    private Sala duzaSala;
    private MalyOchroniarz malyOchroniarz;
    private DuzyOchroniarz duzyOchroniarz;

    public Dyskoteka() {
        this.hol = new Hol();
        this.malaSala = new Sala(51);
        this.duzaSala = new Sala(75);
        this.malyOchroniarz = new MalyOchroniarz(malaSala, duzaSala, hol);
        this.duzyOchroniarz = new DuzyOchroniarz(malaSala, duzaSala, hol);
    }


    public void goLive() {
        inviteAll();
        duzyOchroniarz.printStrangers();
    }

    private void inviteAll() {
        Random random = new Random();
        List<Uczestnik> uczestnicyWHolu = hol.getUczestnicy();
        Iterator<Uczestnik> iter = uczestnicyWHolu.iterator();
        while (iter.hasNext()) {
            Uczestnik iteraredUczestnik = iter.next();
            if (random.nextBoolean()) {
                if (malyOchroniarz.check(iteraredUczestnik)) {
                    iter.remove();
                }
            } else {
                if (duzyOchroniarz.check(iteraredUczestnik)) {
                    iter.remove();
                }
            }
        }
    }
}
