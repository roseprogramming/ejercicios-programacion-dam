package com.dam.programacion.basics.exceptions.atm_machine;

public class AtmMachineDemo {
    public static void main(String[] args) {
        double saldo = 100.0;

        try {
            withdrawMoney(saldo, -50); // Intentamos retirar monto negativo
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Monto inválido. " + e.getMessage());
        }
    }
    //throws InsufficientFundsException: declaramos solo la personalizada porque IllegalArgumentException
    // es unchecked (no necesita declararse).
    public static void withdrawMoney(double balance, double amount) throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw negative amount.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance to withdraw $" + amount);
        }
        System.out.println("Withdrew $" + amount + ". Remaining balance: $" + (balance - amount));
    }
}
