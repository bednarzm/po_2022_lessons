package com.company.demonstracja;

import com.company.Adit;

public class Demonstracja {

    public static void main(String[] args) {
        System.out.println("Start demonstracji");
        Adit adit = new Adit(5, 15, 4);
        adit.wypiszStrukturePublic();

        System.out.println("Gornik zaczyna kopac");
        adit.runAudit();

        System.out.println("Kopalnia po przekopaniu jest pusta :(");
        adit.wypiszStrukturePublic();

        System.out.println("Koniec");
    }
}
