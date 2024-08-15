package com.corejava.typecasting.implicit;

public class IntToDouble {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int balance = 100;
        double balanceInDouble = balance;

        System.out.println(balance);
        System.out.println(balanceInDouble);
    }
}
