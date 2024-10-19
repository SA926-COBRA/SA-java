package com.corejava.solid;

public class NoShape implements Shape {
    @Override
    public double are() {
        throw new IllegalStateException("Cannot calculate are!");
    }
}
