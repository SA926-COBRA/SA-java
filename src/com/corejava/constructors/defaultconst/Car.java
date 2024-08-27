package com.corejava.constructors.defaultconst;

public class Car {

    String brand;
    String model;
    String colour;
    int year;

    // Default Constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.colour = "Unknown";
        this.year = 0;
    }

    public void displayInfo() {
        System.out.println("Brand Name: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Year: " + year);
    }
}
