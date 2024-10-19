package com.projects.personalexpensetracker;

public class Expense {
    private String date;
    private String description;
    private String category;
    private double amount;

    public Expense(String date, String description, String category, double amount) {
        this.date = date;
        this.description = description;
        this.category = category;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Description: " + description + ", Category: " + category + ", Amount: " + amount;
    }
}
