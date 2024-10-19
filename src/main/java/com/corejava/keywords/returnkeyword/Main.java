package com.corejava.keywords.returnkeyword;

public class Main {
    public static void main(String[] args) {
        var names = new String[]{
                "John Doe",
                "Michael Smith",
                "John Smith",
                "Johnny Harris",
                "Luke Belmar",
                "Iman Gadzhi"
        };

        for (var name : names) {
            if (name.startsWith("L")) {
                return;
            }
            System.out.println(name);
        }
        System.out.println("End of main method!");  // won't print if there's any name starts with L
    }
}