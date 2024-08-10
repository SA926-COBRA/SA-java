package com.corejava.accessmodifiers.privateaccessmodifier;

public class Main {

    // creating private attribute
    private static String name = "Riyanshi";

    public static void main(String[] args) {
        // name can be accessed in here because it's in Main class
        System.out.println("My sisters name is : " + name);
    }
}
