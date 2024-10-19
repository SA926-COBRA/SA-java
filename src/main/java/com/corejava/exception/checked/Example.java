package com.corejava.exception.checked;

public class Example {
    public static void main(String[] args) {
        System.out.println(divide(12, 0));
    }

    public static double divide(double d1, double d2) throws IllegalArgumentException {
        if (d2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return d1 / d2;
    }
}
