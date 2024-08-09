package com.krishna.operators.logicaloperator;

import java.util.Scanner;

public class AND_Operator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        // checks both conditions if they are true or not
        if ((age >= 18) && (age <= 60)) {
            System.out.println("Your are eligible to vote!");
        } else {
            System.out.println("Your are not eligible to vote!");
        }
    }
}
