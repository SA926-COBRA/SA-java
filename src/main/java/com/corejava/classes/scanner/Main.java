package com.corejava.classes.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello what is your name?");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello " + input);

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        if (age > 16) {
            System.out.println("You are an adult!");
        }
        System.out.println("You are a child!");
    }
}
