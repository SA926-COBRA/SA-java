package com.corejava.exception.own;

public class HandlingUncheckedException {

    public static void main(String[] args) {
        System.out.println(divide(10, 0));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new MyUncheckedException("Can not Divide by Zero");
        }
        return a / b;
    }
}
