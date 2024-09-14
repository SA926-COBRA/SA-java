package com.corejava.oop.encapsulation;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
                "Krishna",
                new BigDecimal("100.00"),
                false
        );

        System.out.println(account.withdraw(new BigDecimal("90.00")));

        System.out.println(account.getBalance());

        System.out.println();

        System.out.println(account.withdraw(new BigDecimal("10.00")));

        System.out.println(account.getBalance());

        System.out.println();

        System.out.println(account.withdraw(new BigDecimal("100.00")));

        System.out.println(account.getBalance());

        account.setBalance(new BigDecimal("10000000000.00"));

        System.out.println(account.getBalance());

    }
}
