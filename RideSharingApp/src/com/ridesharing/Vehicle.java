package com.ridesharing;

// Step 4.1: Create an abstract Vehicle class
abstract class Vehicle {
    public abstract void bookRide();
}

// Step 4.2: Implement concrete vehicle classes
class Car extends Vehicle {
    public void bookRide() {
        System.out.println("Car ride booked.");
    }
}

class Bike extends Vehicle {
    public void bookRide() {
        System.out.println("Bike ride booked.");
    }
}

class Scooter extends Vehicle {
    public void bookRide() {
        System.out.println("Scooter ride booked.");
    }
}

// Step 4.3: Create a VehicleFactory to generate vehicles
class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "scooter":
                return new Scooter();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}
