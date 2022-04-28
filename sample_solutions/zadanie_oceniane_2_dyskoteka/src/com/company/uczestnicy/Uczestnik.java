package com.company.uczestnicy;

import com.company.ochroniarze.rejestr_visitor.RejestrVisitor;

import java.util.List;
import java.util.Random;

public abstract class Uczestnik {
    private static int nastepneId = 0;
    private int unikalneId;
    private String imie;
    private String nazwisko;
    protected int wiek;

    private List<String> imiona = List.of("Andrzej", "Artur", "Mateusz", "Antoni", "Kacper", "Alojzy", "Zenon", "Fabian", "Gabriel", "Aleksander");
    private List<String> nazwiska = List.of("Kappa", "Kowalski", "Potter", "Wiedzmak", "Nowak", "Gierek", "Iks", "Glowa", "Dzien", "Jaskinia");

    public Uczestnik() {
        this.unikalneId = nastepneId;
        nastepneId++;
        Random random = new Random();
        this.imie = imiona.get(random.nextInt(imiona.size()));
        this.nazwisko = nazwiska.get(random.nextInt(nazwiska.size()));
    }

    public abstract void applyVisitor(RejestrVisitor visitor);

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Integer.hashCode(unikalneId);
        return result;
    }

    // equals ma byc na podstawie id, wiec hash code tez, bo jesli sa rowne to hashcode musi byc taki sam
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Uczestnik uczestnik = (Uczestnik) o;

        return unikalneId == uczestnik.unikalneId;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "unikalneId=" + unikalneId +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
