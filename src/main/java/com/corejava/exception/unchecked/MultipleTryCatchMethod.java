package com.corejava.exception.unchecked;

public class MultipleTryCatchMethod {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1");
//            int number = Integer.parseInt("1x");
            System.out.println(number);

            for (int i = 10; i <= 10; i--) {
                System.out.println(10 / i);
            }

        } catch (NumberFormatException e) {
            System.out.println("Failed to parse 1x as an Integer");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
