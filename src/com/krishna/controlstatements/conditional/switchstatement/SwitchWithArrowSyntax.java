package com.krishna.controlstatements.conditional.switchstatement;

import java.util.Scanner;

public class SwitchWithArrowSyntax {
    public static void main(String[] args) {
        // Only Java Version 12+ Supports Arrow Syntax in Switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a fruit name (apple, banana, cherry) : ");
        String fruit = sc.nextLine().toLowerCase();

        switch (fruit) {
            case "apple" -> System.out.println("Apples are Red or Green!");
            case "banana" -> System.out.println("Bananas are Yellow");
            case "cherry" -> System.out.println("Cherries are Red");
            default -> System.out.println("Unknown Fruit " + fruit);
        }
    }
}
