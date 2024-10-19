package com.corejava.oop.polymorphism.compiletime;

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers (overloaded method with different data types)
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum of two integers: " + calculator.add(10, 20));
        System.out.println("Sum of three integers: " + calculator.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + calculator.add(10.5, 20.5));
    }
}

