package com.krishna.operators.arithmeticOperator;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int dividend = sc.nextInt();

        System.out.println("Enter the divisor : ");
        int divisor = sc.nextInt();

        sc.close();

        int result = dividend / divisor;
        System.out.println("The result is : " + result);
    }
}
