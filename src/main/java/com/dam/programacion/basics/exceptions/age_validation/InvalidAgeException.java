package com.dam.programacion.basics.exceptions.age_validation;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Calls Exception constructor
    }
}
