package com.corejava.string.literal;

    public class StringLiteral {
        public static void main(String[] args) {
            // String Literal is an effective way for creating String variable

            // Creating String Variable using String Literal
            String name = "Krishna";
            String myAddress = "Nepal";

            System.out.println("My name is " + name + ", I am from " + myAddress);

            // Now if we crate another String with the same value, it will reuse the value instead of adding new one.
            String mothersAddress = "Nepal";
            System.out.println("My name is " + name + ", I am from " + myAddress + ", and My mother is also from " + mothersAddress);

            // In this example the "Nepal" is reused in String Pool within the Heap Memory.
        }
    }
