package com.corejava.exception;

public class Exception {
    public static void main(String[] args) {

        System.out.println();

        // increment
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        // Reverse
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 10; i >= 0; i--) {
            System.out.println(10 / i);     // divide by 0 exception occurs
        }

        int number = Integer.parseInt("1x");
        System.out.println(number);
    }
}
