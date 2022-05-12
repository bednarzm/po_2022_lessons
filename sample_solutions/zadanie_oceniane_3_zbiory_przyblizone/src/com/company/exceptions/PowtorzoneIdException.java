package com.company.exceptions;

public class PowtorzoneIdException extends Exception {
    public PowtorzoneIdException() {
        super("Id zostalo powtorzone");
    }
}
