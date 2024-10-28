package com.practice.exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        }
        System.out.println("You are eligible to register.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Method that might throw an exception
            checkEligibility(age);

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("Scanner resource closed.");
        }
    }
}

