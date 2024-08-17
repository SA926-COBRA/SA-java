package com.corejava.exception;

public class MultipleTryCatchMethod {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1");
            System.out.println(number);

            for (int i = 10; i >= 10; i--) {
                System.out.println(10 / i);
            }

        } catch (NumberFormatException e) {
            System.out.println("Failed to parse 1x as an Integer");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
