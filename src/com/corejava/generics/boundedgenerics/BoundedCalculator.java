package com.corejava.generics.boundedgenerics;

// T is bounded by Number, meaning it can only be a subclass of Number (e.g., Integer, Double, etc.)
public class BoundedCalculator<T extends Number> {

    // Method to add two numbers
    public double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // Method to subtract two numbers
    public double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    // Method to multiply two numbers
    public double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    // Method to divide two numbers
    public double divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}

// Main class to test BoundedCalculator
class Main {
    public static void main(String[] args) {
        // Creating a BoundedCalculator for Integers
        BoundedCalculator<Integer> intCalc = new BoundedCalculator<>();
        System.out.println("Integer Addition: " + intCalc.add(10, 20));
        System.out.println("Integer Subtraction: " + intCalc.subtract(20, 10));
        System.out.println("Integer Multiplication: " + intCalc.multiply(10, 5));
        System.out.println("Integer Division: " + intCalc.divide(20, 5));

        // Creating a BoundedCalculator for Doubles
        BoundedCalculator<Double> doubleCalc = new BoundedCalculator<>();
        System.out.println("Double Addition: " + doubleCalc.add(10.5, 20.3));
        System.out.println("Double Subtraction: " + doubleCalc.subtract(20.3, 10.5));
        System.out.println("Double Multiplication: " + doubleCalc.multiply(10.5, 2.0));
        System.out.println("Double Division: " + doubleCalc.divide(20.5, 2.0));
    }
}
