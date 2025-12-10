package com.dam.programacion.basics.exceptions.number_validation;

import java.util.Scanner;

public class NumberValidator {
    // Method that throws exception if number is negative
    public static void verifyNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed: " + number + "!");
        }
        System.out.println("Valid number: " + number);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Verify the number using our custom exception
            verifyNumber(number);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("End of program.");
        }
    }
}
