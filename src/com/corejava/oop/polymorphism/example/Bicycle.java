package com.corejava.oop.polymorphism.example;

public class Bicycle {
    private int currentSpeed;

    public Bicycle() {
    }

    public Bicycle(int currentSpeed) {
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
