package com.corejava.datatypes.primitive;

public class DoubleDataType {
    public static void main(String[] args) {
        double num1 = 20.36;
        double num2 = 136.89;

        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println(String.format("The sum of %.2f and %.2f is = %.2f%n", num1, num2, sum));
        System.out.printf("The sum of %.2f and %.2f is = %.2f%n", num1, num2, sum);
    }
}
