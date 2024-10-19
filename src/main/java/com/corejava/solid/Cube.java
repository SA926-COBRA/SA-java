package com.corejava.solid;

public class Cube implements Shape, ThreeDimensionalShape {

    @Override
    public double are() {
        return 100;
    }

    @Override
    public double volume() {
        return 0;
    }
}
