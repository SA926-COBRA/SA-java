package com.krishna.controlStatements.loop.enhancedForLoop;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] names = {
                "Krishna",
                "Sangita",
                "Naresh",
                "Radha",
                "Riyanshi",
                "Parwati",
                "Bhim",
                "Paru",
                "Bibechana"
        };

        // Enhanced for loop
        for (String name : names) {
            System.out.println("Name : " + name);
        }
    }
}
