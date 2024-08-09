package com.krishna.controlStatements.conditional;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        sc.close();

        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            int meetAge = Math.abs(age - 18);
            System.out.println("You need to wait " + meetAge + " more year(s) to be eligible to vote.");
        }
    }
}
