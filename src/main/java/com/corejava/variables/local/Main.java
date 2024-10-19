package com.corejava.variables.local;


public class Main {
    public static void main(String[] args) {
        // Declaring local variable
        var name = "Riyanshi";

        // Accessing Local variable within the same method
        System.out.println(name);
    }

    private static void dai() {
        // Trying to access local variable from another method, it gives error.
        //  System.out.println(name);
    }
}
