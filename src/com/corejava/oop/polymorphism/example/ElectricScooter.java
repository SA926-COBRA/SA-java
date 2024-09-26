package com.corejava.oop.polymorphism.example;

public class ElectricScooter implements Vehicle {
    private int currentSpeed;

    public ElectricScooter() {
    }

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("Hop on and press button");
        this.currentSpeed += amount;
    }

    @Override
    public void applyBreaks(int amount) {
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
