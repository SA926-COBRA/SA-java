package com.practice.controlstatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    validOperation = false;
                }
            }
            default -> {
                System.out.println("Error: Invalid operator!");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println("The result is: " + result);
        }
    }
}
