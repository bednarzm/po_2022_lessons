package com.company;

import com.company.obiekty_kopalniane.Chalkonit;
import com.company.obiekty_kopalniane.pomocnicze.ObiektKopalniany;
import com.company.obiekty_kopalniane.Skala;
import com.company.obiekty_kopalniane.Uraninit;

import java.util.Random;

public class Adit {
    private int maxDystans;
    private int dlugoscKorytarzy;
    private int iloscKorytarzy;
    private int dlugoscSzybu;
    private ObiektKopalniany[][] strukturaKopalni;
    private Gornik gornik;

    public Adit(int maxDystans, int dlugoscKorytarzy, int iloscKorytarzy) {
        this.maxDystans = maxDystans;
        this.dlugoscKorytarzy = dlugoscKorytarzy;
        this.iloscKorytarzy = iloscKorytarzy;

        this.dlugoscSzybu = (maxDystans + 1) * iloscKorytarzy;
        strukturaKopalni = new ObiektKopalniany[dlugoscSzybu][];

        Random rand = new Random();
        int indexAktualnegoKorytarza = 0;
        for (int i = 0; i < iloscKorytarzy; i++) {
            indexAktualnegoKorytarza += rand.nextInt(maxDystans);
            ObiektKopalniany[] aktualnyKorytarz = new ObiektKopalniany[dlugoscKorytarzy];
            for (int j = 0; j < dlugoscKorytarzy; j++) {
                double randomValue = rand.nextDouble();
                if (randomValue < 0.1) {
                    aktualnyKorytarz[j] = new Uraninit(50);
                } else if (randomValue < 0.3) {
                    aktualnyKorytarz[j] = new Chalkonit(50);
                } else {
                    aktualnyKorytarz[j] = new Skala();
                }
            }
            strukturaKopalni[indexAktualnegoKorytarza] = aktualnyKorytarz;

            // zwiekszamy indeks aktualnego korytarza o 1, zeby w nastepnej iteracji petli w przypadku,
            // kiedy losowa wartosc bedzie 0, nie wypelnic ponownie tego samego korytarza
            indexAktualnegoKorytarza++;
        }

        this.gornik = new Gornik(strukturaKopalni);
    }

    public void runAudit() {
        gornik.goMiner();
        System.out.println(gornik.getIncome());
    }

    // dodaje zeby uzyc w demonstracji, a wypiszStrukture ma byc zgodnie z poleceniem private
    public void wypiszStrukturePublic() {
        wypiszStrukture();
    }

    // private, bo uzywana tylko na terenie klasy Audit
    private void wypiszStrukture() {
        for (ObiektKopalniany[] korytarz : strukturaKopalni) {
            if (korytarz == null) {
                System.out.print(" ");
            } else {
                System.out.print("->");
                for (ObiektKopalniany obiektKopalniany : korytarz) {
                    if (obiektKopalniany == null) {
                        System.out.print(" ");
                    } else {
                        System.out.print(obiektKopalniany);
                    }
                }
            }
            // przejdz do nastepnej lini
            System.out.println();
        }
    }

    public int getMaxDystans() {
        return maxDystans;
    }

    public int getDlugoscKorytarzy() {
        return dlugoscKorytarzy;
    }

    public int getIloscKorytarzy() {
        return iloscKorytarzy;
    }

    public int getDlugoscSzybu() {
        return dlugoscSzybu;
    }
}
