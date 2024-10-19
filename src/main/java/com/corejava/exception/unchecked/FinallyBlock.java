package com.corejava.exception.unchecked;

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1");
            System.out.println("Number : %d" + number);
        } catch (NumberFormatException e) {
            System.out.println("Failed to parse 1x as integer");
        } finally {
            System.out.println("Finally always runs!");
        }
    }
}
