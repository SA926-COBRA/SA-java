package com.corejava.oop.polymorphism.example;

public class Bicycle implements Vehicle {
    private int currentSpeed;

    public Bicycle() {
    }

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount) {
        System.out.println("pedal");
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
