package com.corejava.exception.own;

public class HandlingCheckedException {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (MyCheckedException e) {
            e.getMessage();
        }
    }

    public static int divide(int a, int b) throws MyCheckedException {
        if (b == 0) {
            throw new MyCheckedException("Cannot divide by zero");
        }
        return a / b;
    }
}
