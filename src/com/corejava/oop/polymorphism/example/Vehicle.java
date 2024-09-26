package com.corejava.oop.polymorphism.example;

public interface Vehicle {
    // Interfaces only can contain
    // 1. Constants
    // 2. Abstract Methods
    // 3. Default Methods

    // Abstract Methods
    void move(int amount);

    void applyBreaks(int amount);

    int getCurrentSpeed();
}
