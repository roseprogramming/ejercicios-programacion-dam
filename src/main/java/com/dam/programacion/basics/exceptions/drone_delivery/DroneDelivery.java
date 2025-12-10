package com.dam.programacion.basics.exceptions.drone_delivery;
// Drone package delivery system

// If package weight exceeds limit → throw PackageTooHeavyException (custom).
// If destination is outside coverage area → throw InvalidDestinationException (custom).
public class DroneDelivery {
    public static void main(String[] args) {
        double weight = 8.0; // kg
        String destination = "Campo";
        int battery = 25; // %

        try {
            sendPackage(weight, destination, battery);
            System.out.println("Package sent successfully.");
        } catch (PackageTooHeavyException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidDestinationException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (LowBatteryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    //Both exceptions are checked, therefore:
    //They must be declared with throws in the method.
    //The compiler forces to catch them with try-catch.
    public static void sendPackage(double weight, String destination, int battery)
            throws PackageTooHeavyException, InvalidDestinationException, LowBatteryException {

        if (weight > 10.0) {
            throw new PackageTooHeavyException("Package weighs " + weight + " kg. Maximum allowed: 10 kg.");
        }

        if (!destination.equalsIgnoreCase("Ciudad") && !destination.equalsIgnoreCase("Campo")) {
            throw new InvalidDestinationException("Destination '" + destination + "' outside delivery area.");
        }

        if (battery < 30) {
            throw new LowBatteryException("Battery at " + battery + "%. Minimum required: 30%.");
        }

        System.out.println("Sending package of " + weight + " kg to " + destination + " with battery at " + battery + "%...");
    }
}
