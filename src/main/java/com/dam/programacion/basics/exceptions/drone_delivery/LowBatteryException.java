package com.dam.programacion.basics.exceptions.drone_delivery;

public class LowBatteryException extends Exception {
    public LowBatteryException(String message) {
        super(message);
    }
}
