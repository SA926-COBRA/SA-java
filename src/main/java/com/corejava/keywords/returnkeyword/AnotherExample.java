package com.corejava.keywords.returnkeyword;

public class AnotherExample {
    public static void main(String[] args) {
        checkNumber(4);
        checkNumber(8);
        checkNumber(-3);
        checkNumber(9);
        checkNumber(5);
    }

    public static void checkNumber(int number) {
        if (number < 0) {
            System.out.println("Number is negative, exiting the method");
            return;
        }
        System.out.println("Processing Number : " + number);
        // More code can be here, but it won't run if the number is negative.
    }
}
