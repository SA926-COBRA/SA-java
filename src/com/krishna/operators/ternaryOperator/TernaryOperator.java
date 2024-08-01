package com.krishna.operators.ternaryOperator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20, max;

        System.out.println("First num : " + a);
        System.out.println("Second num : " + b);

        max = (a > b) ? a : b;  // max = Math.max(a, b);
        System.out.println("Maximum num : " + max);

        /*
            if (Expression1) {
            variable = Expression2;
            } else {
            variable = Expression3;
            }
        */
    }
}
