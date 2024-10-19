package com.practice.exceptionhandling;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money, with exception handling for negative amounts
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Successfully deposited " + amount + ". New balance: " + balance);
    }

    // Withdraw money, with exception handling for negative amounts and insufficient balance
    public void withdraw(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            throw new InvalidAmountException("Insufficient balance. Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew " + amount + ". New balance: " + balance);
    }

    // Check the balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

