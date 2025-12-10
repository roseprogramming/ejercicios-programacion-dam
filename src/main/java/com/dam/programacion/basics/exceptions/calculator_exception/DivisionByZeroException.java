package com.dam.programacion.basics.exceptions.calculator_exception;

public class DivisionByZeroException extends Exception {
    //si fuese runeneable no seria chequeada

    public DivisionByZeroException(String msg) {
        super(msg);
    }

}
