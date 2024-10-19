package com.corejava.exception.unchecked;

public class UsingORWithinCatch {
    public static void main(String[] args) {
        try {

            int number = Integer.parseInt("1x");
            // int number = Integer.parseInt("1x");

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
            System.out.println("End");
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
