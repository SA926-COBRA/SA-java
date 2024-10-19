package com.projects.bankingsystem;

import java.util.Scanner;
import java.util.UUID;

// User class representing a bank account holder
class User {
    private String userId;
    private String name;
    private double balance;

    public User(String name, double initialDeposit) {
        this.userId = UUID.randomUUID().toString(); // Generate a unique ID
        this.name = name;
        this.balance = initialDeposit;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void transfer(User recipient, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transfer successful! New balance: " + balance);
        } else {
            System.out.println("Transfer failed. Insufficient balance or invalid amount!");
        }
    }
}

public class Main {
    private static User[] users = new User[10];  // Array to store users
    private static int userCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the input buffer

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    checkBalance();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting... Thank you for using the banking system.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- Banking System Menu ---");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer");
        System.out.println("5. Check Balance");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void createAccount() {
        if (userCount < users.length) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter initial deposit amount: ");
            double initialDeposit = scanner.nextDouble();

            User newUser = new User(name, initialDeposit);
            users[userCount++] = newUser;

            System.out.println("Account created successfully! Your User ID is: " + newUser.getUserId());
        } else {
            System.out.println("Sorry, the system is full. No more accounts can be created.");
        }
    }

    private static User findUserById(String userId) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUserId().equals(userId)) {
                return users[i];
            }
        }
        return null;
    }

    private static void deposit() {
        System.out.print("Enter your User ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);

        if (user != null) {
            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();
            user.deposit(amount);
        } else {
            System.out.println("User not found!");
        }
    }

    private static void withdraw() {
        System.out.print("Enter your User ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);

        if (user != null) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();
            user.withdraw(amount);
        } else {
            System.out.println("User not found!");
        }
    }

    private static void transfer() {
        System.out.print("Enter your User ID: ");
        String senderId = scanner.nextLine();
        User sender = findUserById(senderId);

        if (sender != null) {
            System.out.print("Enter recipient User ID: ");
            String recipientId = scanner.nextLine();
            User recipient = findUserById(recipientId);

            if (recipient != null) {
                System.out.print("Enter transfer amount: ");
                double amount = scanner.nextDouble();
                sender.transfer(recipient, amount);
            } else {
                System.out.println("Recipient not found!");
            }
        } else {
            System.out.println("Sender not found!");
        }
    }

    private static void checkBalance() {
        System.out.print("Enter your User ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);

        if (user != null) {
            System.out.println("Your balance is: " + user.getBalance());
        } else {
            System.out.println("User not found!");
        }
    }
}
