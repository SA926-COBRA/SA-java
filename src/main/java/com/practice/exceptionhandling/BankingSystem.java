package com.practice.exceptionhandling;

import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a BankAccount object with an initial balance
        BankAccount account = new BankAccount("123456789", 1000.00);

        while (true) {
            System.out.println("\n=== Banking System Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        account.checkBalance();
                        break;

                    case 4:
                        System.out.println("Exiting the banking system. Goodbye!");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (InvalidAmountException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Thank you for using the banking system.");
            }
        }
    }
}