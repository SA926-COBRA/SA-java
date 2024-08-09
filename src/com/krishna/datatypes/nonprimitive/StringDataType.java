package com.krishna.datatypes.nonprimitive;

public class StringDataType {
    public static void main(String[] args) {
        String name = "Krishna";
        System.out.println("My name is : " + name);

        // To  print in uppercase
        System.out.println("My name is : " + name.toUpperCase());
        System.out.println("My name is : " + name.toLowerCase());

        System.out.println("My name is : " + name.substring(0, 5));

        System.out.println("      ".isEmpty());
        System.out.println("      ".isBlank());

        // to get rid of spaces
        System.out.println("              a                      ".trim());
    }
}
