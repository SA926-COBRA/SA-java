package com.corejava.controlstatements.loop.forloop;

public class ForLoopInArray {
    public static void main(String[] args) {
        String[] name = new String[5];
        name[0] = "John";
        name[1] = "Jane";
        name[2] = "Doe";
        name[3] = "Jack";
        name[4] = "Smith";

        for (int i = 0; i < name.length; i++) {

            String current = name[i];
            System.out.println("\nCurrent Name : " + current);

            String next = name[i + 1];
            System.out.println("Next Name : " + next);
        }

        System.out.println("\nReverse For Loop");
        for (int i = name.length - 1; i > 0; i--) {
            System.out.println("Name : " + name[i]);
        }
    }
}
