package com.corejava.string.literalsvsobjects;

public class StringObject {
    public static void main(String[] args) {
        // This is another way to crate String variables
        String name = new String("Krishna");
        System.out.println(name);

        // Here's the same value within the String variable, but it won't re-use
        String myMomCallsMe = "Krishna";
        System.out.println(myMomCallsMe);
    }
}
