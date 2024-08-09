package com.krishna.controlStatements.conditional;

import java.util.Objects;
import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your country name : ");
        String countryName = sc.next().toLowerCase();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (countryName.equals("nepal") && age >= 18) {
            System.out.println("You are eligible to vote!");
        } else if (countryName.equals("nepal")) {     // This condition will only be reached if age < 18
            int yearsToWait = Math.abs(age - 18);
            System.out.println("You have to wait " + yearsToWait + " more year(s) to be eligible to vote");
        } else {
            System.out.println("Your are not eligible to vote");
        }
    }
}
