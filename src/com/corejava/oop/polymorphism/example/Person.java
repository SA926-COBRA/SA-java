package com.corejava.oop.polymorphism.example;

public class Person {
    private String name;
    private Car car;
    private ElectricScooter electricScooter;
    private Bicycle bicycle;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Car car, ElectricScooter electricScooter, Bicycle bicycle) {
        this.name = name;
        this.car = car;
        this.electricScooter = electricScooter;
        this.bicycle = bicycle;
    }
}
