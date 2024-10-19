package com.corejava.keywords.statickeyword.statickeyword1;

public class UsingStaticKeyword {
    // Static Variable
    static int count = 0;

    // Static block
    static {
        System.out.println("Hello from Static block!");
    }

    // Static Method
    static void incrementCount() {
        count++;
        System.out.println("Count : " + count);
    }

    public static void main(String[] args) {
        // Accessing static variable directly using the class name
        System.out.println("Initial count : " + UsingStaticKeyword.count);

        // Modifying the static variable
        UsingStaticKeyword.count += 5;

        // Accessing static method directly using the class name
        UsingStaticKeyword.incrementCount();

    }
}
