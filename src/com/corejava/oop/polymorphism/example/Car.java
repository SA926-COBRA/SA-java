package com.corejava.oop.polymorphism.example;

public class Car {
    private int currentSpeed;

    public Car() {
    }

    public Car(int currentSpeed) {
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
