package com.company;

import com.company.obiekty_kopalniane.pomocnicze.ObiektKopalniany;

public class Gornik {
    private double income;
    private ObiektKopalniany[][] strukturaKopalni;

    public Gornik(ObiektKopalniany[][] strukturaKopalni) {
        this.income = 0;
        this.strukturaKopalni = strukturaKopalni;
    }

    public void goMiner() {
        for (int i = 0; i < strukturaKopalni.length; i++) {
            if (strukturaKopalni[i] != null) {
                for (int j = 0; j < strukturaKopalni[i].length; j++) {
                    if (strukturaKopalni[i][j] != null) {
                        income += strukturaKopalni[i][j].getModifiedMarketValue();
                        strukturaKopalni[i][j] = null;
                    }
                }
            }
        }
    }

    public double getIncome() {
        return income;
    }
}
