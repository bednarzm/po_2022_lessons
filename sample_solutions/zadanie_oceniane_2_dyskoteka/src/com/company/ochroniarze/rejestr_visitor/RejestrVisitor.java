package com.company.ochroniarze.rejestr_visitor;

import com.company.ochroniarze.RejestrObcych;
import com.company.uczestnicy.OsobaZZewnatrz;
import com.company.uczestnicy.Student;
import com.company.uczestnicy.Studentka;

import java.util.ArrayList;
import java.util.List;

public class RejestrVisitor {
    private RejestrObcych rejestrObcych;

    public RejestrVisitor(RejestrObcych rejestrObcych) {
        this.rejestrObcych = rejestrObcych;
    }

    // jesli odwiedzimy osobe z zewnatrz i nie ma jej w rejestrze to ja dodajemy
    public void visitOsobaZZewnatrz(OsobaZZewnatrz osobaZZewnatrz) {
        if (rejestrObcych.czymMoznaDodac(osobaZZewnatrz)){
            rejestrObcych.dodajDoRejestru(osobaZZewnatrz);
        }
    }

    // nic nie robimy jesli odwiedzilismy studenta lub studentke
    public void visitStudent(Student student){

    }

    public void visitStudentka(Studentka studentka){

    }
}
