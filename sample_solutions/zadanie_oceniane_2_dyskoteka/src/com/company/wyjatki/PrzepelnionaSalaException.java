package com.company.wyjatki;

public class PrzepelnionaSalaException extends Exception{
    public PrzepelnionaSalaException() {
        super("Sala zostala przepelniona");
    }
}
