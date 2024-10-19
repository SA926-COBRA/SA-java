package com.corejava.solid;

public class Circle implements Shape {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double are() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
