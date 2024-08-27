package com.corejava.constructors.defaultconst;

public class Main {
    public static void main(String[] args) {
        // Creating Object
        Car car1 = new Car();

        //Assigning Value to variables.
        car1.model = "Tesla Model 3";
        car1.brand = "Tesla";
        car1.colour = "White";
        car1.year = 2024;

        // Calling displayInfo() method
        car1.displayInfo();

        // Creating another object
        Car car2 = new Car();

        // calling method without assigning the value
        car2.displayInfo();
    }
}
