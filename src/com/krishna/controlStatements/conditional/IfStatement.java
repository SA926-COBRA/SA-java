package com.krishna.controlStatements.conditional;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        sc.close();

        if (age > 18) {
            System.out.println("You are eligible to vote!");
        }
    }
}
