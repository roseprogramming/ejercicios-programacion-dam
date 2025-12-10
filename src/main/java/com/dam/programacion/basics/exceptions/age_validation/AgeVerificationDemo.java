package com.dam.programacion.basics.exceptions.age_validation;

public class AgeVerificationDemo {
    public static void main(String[] args) {
        int age = 16; // Simulated age

        try {
            checkAge(age);
            System.out.println("Welcome to the club!");
        } catch (InvalidAgeException e) {
            System.out.println("Access denied: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old to enter.");
        }
    }
}