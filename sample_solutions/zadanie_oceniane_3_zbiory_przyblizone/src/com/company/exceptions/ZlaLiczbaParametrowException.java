package com.company.exceptions;

public class ZlaLiczbaParametrowException extends Exception {
    public ZlaLiczbaParametrowException() {
        super("Liczba parametrow sie nie zgadza");
    }
}
