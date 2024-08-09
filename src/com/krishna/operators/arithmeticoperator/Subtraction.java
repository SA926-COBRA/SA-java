package com.krishna.operators.arithmeticoperator;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int firstNum = sc.nextInt();

        System.out.println("Enter Second number : ");
        int secondNum = sc.nextInt();
        sc.close();

        int difference = firstNum - secondNum;
        System.out.println("Subtraction of " + firstNum + " and " + secondNum + " is : " + difference);
    }
}
