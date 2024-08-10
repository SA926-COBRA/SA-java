package com.corejava.operators.arithmeticoperator;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        sc.close();

        int result = num1 * num2;
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is : " + result);
    }
}
