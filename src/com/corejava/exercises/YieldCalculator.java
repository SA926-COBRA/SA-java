package com.corejava.exercises;

import java.util.Scanner;

public class YieldCalculator {
    public static void main(String[] args) {
        double yearlyYield = calculatePropertyYield();
        System.out.println("Yield: " + yearlyYield);
    }


    private static double calculatePropertyYield() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your monthly rent income : ");
        double monthlyRent = input.nextDouble();
        System.out.println("Enter your property price : ");
        double propertyPrice = input.nextDouble();

        double yearlyRent = monthlyRent * 12;
        double yield = (yearlyRent / propertyPrice) * 100;

        return yield;
    }


}
