package com.corejava.typecasting.explicit;

public class DoubleToInt {
    public static void main(String[] args) {
        // Explicit Type Conversion (Narrowing)
        double balance = 12550.48;
        int balanceInInt = (int) balance;

        System.out.println(balance);
        System.out.println(balanceInInt);
    }
}
