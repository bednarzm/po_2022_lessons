package com.company.my_classes;

import com.company.osoba.Kobieta;
import com.company.osoba.Osoba;
import com.company.visitor.OsobaVisitorImpl;

import java.util.Set;
import java.util.stream.Collectors;

public class MyProcessor {

    public static Set<Kobieta> getWomanData(Set<Osoba> listaOsob) {
        OsobaVisitorImpl visitor = new OsobaVisitorImpl();

        for (Osoba osoba : listaOsob) {
            osoba.applyOsobaVisitor(visitor);
        }

        return visitor.getResult();
    }

    public static Set<Osoba> trimData(Set<Osoba> listaOsob) {
        return listaOsob.stream().filter(osoba -> osoba.getTemperatura() > 36.4).collect(Collectors.toSet());

        // sposob bardziej "reczny":
//        Set<Osoba> trimedListaOsob = new HashSet<>();
//        for (Osoba osoba : listaOsob) {
//            if (osoba.getTemperatura() > 36.4){
//                trimedListaOsob.add(osoba);
//            }
//        }
//        return trimedListaOsob;
    }
}
