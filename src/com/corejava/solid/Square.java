package com.corejava.solid;

public class Square implements Shape {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double are() {
        return Math.pow(getLength(), 2);
    }
}
