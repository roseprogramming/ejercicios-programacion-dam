package com.dam.programacion.basics.exceptions.calculator_exception;

public class Calculator {

    public double divide(int numerator, int denominator) throws DivisionByZeroException {
        if(denominator == 0) {
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return (double) numerator / denominator;
    }
}
