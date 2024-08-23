package com.corejava.exception.unchecked;

public class TryCatchMethod {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1x");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Failed to parse 1x as integer");
        }
    }
}
