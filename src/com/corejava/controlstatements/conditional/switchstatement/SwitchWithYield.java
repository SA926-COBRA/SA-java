package com.corejava.controlstatements.conditional.switchstatement;

import java.util.Scanner;

public class SwitchWithYield {
    public static void main(String[] args) {
        // Switch expression with yield (Java 14+)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day : ");
        int day = sc.nextInt();

        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> {
                yield "Invalid Day";     // Using yield to return a value
            }
        };
        System.out.println("Today is " + dayName);
    }
}
