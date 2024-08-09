package com.krishna.controlStatements.conditional.switchStatement;

import java.util.Scanner;

public class SwitchWIthFallThrough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day number (1 for Sunday, 2 for Monday, ..., 7 for Saturday): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
