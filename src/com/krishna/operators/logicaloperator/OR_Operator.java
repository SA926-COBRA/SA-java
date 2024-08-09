package com.krishna.operators.logicaloperator;

public class OR_Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a >= 15 || b <= 20) {
            System.out.println("At least one condition is true!");
        } else {
            System.out.println("Neither condition is true");
        }
    }
}
