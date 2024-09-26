package com.corejava.oop.polymorphism.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();

        Vehicle[] vehicles = {
                car,
                bicycle,
                electricScooter
        };

        Person person = new Person("Ram", vehicles);

        for (Vehicle vehicle : person.getVehicles()) {
            vehicle.move(10);
            System.out.println(vehicle.getCurrentSpeed());
            System.out.println();
        }

        System.out.println("Purchase Rate " + Vehicle.PURCHASE_RATE);
    }
}
