package com.projects.personalexpensetracker;

import java.util.ArrayList;

public class ExpenseTracker {
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            for (int i = 0; i < expenses.size(); i++) {
                System.out.println((i + 1) + ". " + expenses.get(i));
            }
        }
    }

    public void deleteExpense(int index) {
        if (index >= 1 && index <= expenses.size()) {
            expenses.remove(index - 1);
            System.out.println("Expense deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void summarizeExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            double total = 0;
            for (Expense expense : expenses) {
                total += expense.getAmount();
            }
            System.out.println("Total expenses: $" + total);
        }
    }
}
