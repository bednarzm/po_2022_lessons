package com.company.uczestnicy;

import com.company.ochroniarze.rejestr_visitor.RejestrVisitor;

import java.util.Random;

public class Student extends Uczestnik {
    public Student() {
        super();
        Random random = new Random();
        // random.nextInt(9) zwraca liczbe z przedzialu od 0 wlacznie do 9 wylacznie, a wiec do 8 wlacznie
        // 18 + liczba z przedzialu 0-8 daje liczbe z przedzialu 18-26
        this.wiek = 18 + random.nextInt(9);
    }

    @Override
    public void applyVisitor(RejestrVisitor visitor) {
        visitor.visitStudent(this);
    }
}
