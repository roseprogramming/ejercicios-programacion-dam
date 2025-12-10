package com.dam.programacion.basics.exceptions.atm_machine;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}
