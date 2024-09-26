package com.corejava.oop.polymorphism.example;

public interface Vehicle {
    // Interfaces only can contain
    // 1. Constants
    // 2. Abstract Methods
    // 3. Default Methods
    // 4. Static Methods

    // Constants
    Double PURCHASE_RATE = 0.05;

    // Abstract Methods
    void move(int amount);

    void applyBreaks(int amount);

    int getCurrentSpeed();

    // Default Methods
    default double milesToKilometers() {
        return getCurrentSpeed() * 1.609;
    }

    default double KilometersToMiles() {
        return milesToKilometers() / 1.609;
    }

    // Also Static Methods
}
