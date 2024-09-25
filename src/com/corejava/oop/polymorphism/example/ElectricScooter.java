package com.corejava.oop.polymorphism.example;

public class ElectricScooter {
    private int currentSpeed;

    public ElectricScooter() {
    }

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void move(int amount) {
        this.currentSpeed += amount;
    }

    public void applyBreaks(int amount) {
        this.currentSpeed -= amount;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
