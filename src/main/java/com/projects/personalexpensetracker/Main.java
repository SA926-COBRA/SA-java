package com.projects.personalexpensetracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Personal Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. Summarize Expenses");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    tracker.addExpense(new Expense(date, description, category, amount));
                    System.out.println("Expense added successfully.");
                    break;
                case 2:
                    System.out.println("\n--- Expenses ---");
                    tracker.viewExpenses();
                    break;
                case 3:
                    System.out.print("Enter the index of the expense to delete: ");
                    int index = scanner.nextInt();
                    tracker.deleteExpense(index);
                    break;
                case 4:
                    System.out.println("\n--- Summary ---");
                    tracker.summarizeExpenses();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
